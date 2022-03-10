package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
//	isSalaried
	private boolean isSalaried;

	public boolean isSalaried() {
		return isSalaried;
	}

//	MINBAL
	private static final float MINBAL = 1000;
//	private static float MINBAL = 1000;

	public static float getMinbal() {
		return MINBAL;
	}

//	Constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
//		if (isSalaried = true)
//			MINBAL = 0;
//		else
//			MINBAL = 1000;

	}

	@Override
	public void withdraw(float amt) {
		if (isSalaried && (getAccBal() - amt < 0)) {
			System.out.println("insufficient balance".toUpperCase());
		} else if (!isSalaried && (getAccBal() - MINBAL < amt)) {
			System.out.println("Money Withdraw not possible".toUpperCase());
		} else {
			setAccBal(getAccBal() - amt);
			System.out.println("Trasaction Complete.");
		}

	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		System.out.println("Your account Number is " + (getAccNo()) + " & Your Account Balance is " + getAccBal());

		return "\n";
	}
}