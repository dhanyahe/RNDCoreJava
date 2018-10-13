package com.dany.bank;

public  class SavingsAccount extends BankAccount {
	
	 String accountType;

	public String getAccountType() {
		return accountType;
	}

	

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SavingsAccount( String accountHolderName,
			double accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void withdraw(double amount){
		System.out.println("Saving account withdraw");
	}
	
	public void isSalaryAccount(){
		System.out.println("Salary Account");
	}

	

}
