package com.dany.bank;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class BankAccountListv3 {

	
	 LinkedList<BankAccount> accountlist;
	 
	  
	  public BankAccountListv3() {
			accountlist = new LinkedList<BankAccount>();
		}
	  
	  public void addNewBankAccount(BankAccount acc) {
			accountlist.add(acc);
		}
	  public LinkedList<BankAccount> getAllBankAccount() {
			return accountlist;	
		}
	  
	  public BankAccount getAccountById(int accountNo)
	  {
		  for(BankAccount acc : accountlist) {
		  		if(acc.getAccountNo() == accountNo)
		  		{
		  			return acc;
		  		}
		  }
		  throw new RuntimeException("Account Doesn't Exist");
	  	
	  }
	  
	  
	 
	  
	  public  LinkedList<BankAccount> removeBankAccount(int accountNo) {
		 accountlist.remove(accountNo);
		return 	accountlist;
	  }
	  
	  
	  public LinkedList<BankAccount> sortAccountsByName(){
		  Collections.sort(accountlist,(BankAccount acc1,BankAccount acc2)->acc1.getAccountHolderName().compareTo(acc2.accountHolderName));
		  return accountlist;
	  }
	  
	  
	  
	  public LinkedList<BankAccount> sortAccountsByNamev2(){
		  Collections.sort(accountlist,new Comparator<BankAccount>(){
			  @Override
			  public int compare(BankAccount acc1,BankAccount acc2){
				  return acc1.getAccountHolderName().compareTo(acc2.accountHolderName);
			  }
		  });return accountlist;
	  }
	
			public LinkedList<BankAccount> updateBankAccount(int accountNo, String accountHolderName) {
				for(BankAccount acc : accountlist) {
			  		if(acc.getAccountNo() == accountNo)
			  		{
				       acc.setAccountHolderName(accountHolderName);
				       return 	accountlist;
					 }
				 }
				 throw new RuntimeException("Account Doesn't Exist");
			}
	  
	  
			public static void main(String[] args) {
				   BankAccountListv2 list = new BankAccountListv2();
				   list.addNewBankAccount(new SavingsAccount("Shweta",5000.0));
				   list.addNewBankAccount(new SavingsAccount("Dhanya",4000.0));
				   list.addNewBankAccount(new SavingsAccount("Khushboo",4500.0));
				   
				 
				   list.removeBankAccount(3);
				   Iterator<BankAccount> bankIterator = (Iterator<BankAccount>) list.getAllBankAccount();
					while (bankIterator.hasNext()) {
						System.out.println(bankIterator.next());
					}
			 
					
					Iterator<BankAccount> bankIteratorUpdate = (Iterator<BankAccount>) list.updateBankAccount(2, "Danny");
						while (bankIteratorUpdate.hasNext()) {
							System.out.println(bankIteratorUpdate.next());
						}
			
			
			
	  

}
	
	
	
}
