package com.dany.bank;

public  abstract class CurrentAccount extends BankAccount implements Insurance{
@Override
public void withdraw(double amount){
	System.out.println("Current account withdraw method");
}


}
