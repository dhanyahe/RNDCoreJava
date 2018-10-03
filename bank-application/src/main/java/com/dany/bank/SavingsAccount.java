package com.dany.bank;

public abstract class SavingsAccount extends BankAccount {
	
	 String accountType;

	public String getAccountType() {
		return accountType;
	}

	public SavingsAccount() {
		
		accountType = "Savings";
	}

	@Override
	public void withdraw(double amount){
		System.out.println("Saving account withdraw");
	}
	
	public void isSalaryAccount(){
		System.out.println("Salary Account");
	}

	

}
