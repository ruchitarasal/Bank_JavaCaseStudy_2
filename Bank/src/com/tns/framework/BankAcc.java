package com.tns.framework;

public abstract class BankAcc {
//	accNo
	private int accNo;

	public int getAccNo() {
		return accNo;
	}

//	accNm
	private String accNm;

	public String getAccNm() {
		return accNm;
	}

//	public void setAccNm(String accNm) {
//		this.accNm = accNm;
//	}

//	accBal
	private float accBal;

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	// Constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public abstract void withdraw(float amt);

	public void deposite(float amt) {
		accBal += amt;
		System.out.println(amt + " Deposited");
		System.out.println("Trasaction Complete.");
		System.out.println("AVAILABLE BALANCE: " + getAccBal());
	}

	@Override
	public String toString() {
//		System.out.println(accNm + " Your Account is Created.");
		return (accNm + " Your Account is Created.");
	}

}