package com.dany.bank;

/**
 * 
 * @author dhhegde
 * @since 03-10-18
 *
 */

public abstract class BankAccount {
	
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGEn;
	
	{
		accountNo=++autoAccountNoGEn;
	}
	
	
	public BankAccount() {
		
		accountHolderName="Unknown";
		accountBalance=0;
	}
	public BankAccount(int accountNo, String accountHolderName,
			double accountBalance) {
		super();
		accountNo=++autoAccountNoGEn;
		
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	public void withdraw(double amount){
		accountBalance-=amount;
		
	}
	
	public void deposit(double amount){
		accountBalance+=amount;
	}
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance
				+ "]";
	}
	
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	
	
	public int getAccountNo() {
		return accountNo;
	}
	
	
	

}
