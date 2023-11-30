package bank;

/*
 * Account.java         Author: Stephen Isiuwe
 * 
 * java code that represents a bank account with bank services such as 
 * deposit and withdrawal.
 */

import java.text.NumberFormat;

public class Account {
	private final double RATE = 0.035;   // interest rate of 3.5%
	
	private long acctNumber;
	private double balance;
	private String name;
	
	//------------------------------------------------------
	// Sets up the account by defining its owner, account number
	// and initial balance.
	//-------------------------------------------------------
	
	public Account(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	//-------------------------------------------------------
	// Deposits the specified amount into the account
	// Returns the new balance
	//------------------------------------------------------
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	
	//-------------------------------------------------------------
	// Withdraws the specified amount from the account and applies
	// the fees. Returns the new balance
	//------------------------------------------------------------
	public double withdraw(double amount, double fee) {
		balance = balance - amount - fee;
		return balance;
	}
	
	//----------------------------------------------------------
	// Add interest to the account and returns the new balance
	//----------------------------------------------------------
	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}
	
	//--------------------------------------------------------------
	// Returns a one line description of the account as a string
	//---------------------------------------------------------------
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
	
	//------------------------------------------------------------------
	//Return the current balance of the account
	//------------------------------------------------------------------
	public double getBalance() {
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
