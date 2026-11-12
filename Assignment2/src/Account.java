/*
 * Mizbah Ateeq
 * Assignment 2: Objects
 * COP 3330
 * September 15, 2024
 */

public class Account {

	private String accountName;
	private double balance;
	private double interest;
	
	public Account (String accountName, double interest) {
		this.accountName=accountName;
		this.interest = interest;
		this.balance=0.00;
	}
	
	// deposit
	public boolean deposit(double amount) {
		if (amount>0) {
			balance+=amount;
			return true;
		}
		else
			return false;
	}
	
	// withdrawal
	public boolean withdraw(double amount) {
		if(amount<=balance && amount > 0) {
			balance-=amount;
			return true;
		} else 
			return false;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return accountName;
	}
	
	public void calcInterest (int months) {
		if (months>=1 && months <=1000) {
			double interestPd = (interest* (months/12)/ 100);
			balance+=balance*(1+interestPd);
		}
	}
}
	
