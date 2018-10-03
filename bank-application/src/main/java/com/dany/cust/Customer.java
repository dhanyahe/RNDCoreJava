package com.dany.cust;

import com.dany.bank.BankAccount;
import com.dany.bank.CurrentAccount;
import com.dany.bank.CurrentAccountv2;
import com.dany.bank.SavingsAccount;
import com.dany.bank.SavingsAccountv2;

public class Customer {
	public static void main(String []args)
	{
		/*BankAccount acc1=null;
			acc1=	new SavingsAccount();
		acc1.withdraw(5000);*/
		//acc1.isSalaryAccount();
		SavingsAccountv2 s1=new SavingsAccountv2();
		System.out.println(s1.getInsuranceId());
		CurrentAccountv2 c1=new CurrentAccountv2();
		System.out.println(c1.getInsuranceName());
		
	}

}
