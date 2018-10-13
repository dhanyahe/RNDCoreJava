package com.dany.bank;

public class BankAccountList {
	
BankAccount[] acc;
BankAccount[] accountList;
int index = -1;

public BankAccountList(int size) {
	accountList = new BankAccount[size];
}

public BankAccountList() {
	accountList = new BankAccount[100];
}

public void addNewBankAccount(BankAccount acc) {
	accountList[++index] = acc;
}

public BankAccount[] getAllBankAccount() {
	return accountList;	
}

public BankAccount getAccountById(int accountNo)
{
	for(BankAccount acc : accountList) {
		if(acc.getAccountNo() == accountNo) {
			return acc;
		}
	}
	throw new RuntimeException("Account Doesn't Exist");		
}

public BankAccount[] removeBankAccountById(int accountNo) {	
	  for(int internalIndex=0; internalIndex <= index; internalIndex++) {
		 if (accountList[internalIndex].getAccountNo() == accountNo) {
			 for(int insideInternalLoop=internalIndex; insideInternalLoop < accountList.length - 1; insideInternalLoop++) {					 
				 accountList[insideInternalLoop] = accountList[insideInternalLoop + 1];
           }
		 index--;
	  } 
    }
   return accountList;
}

public BankAccount[] updateBankAccount(int accountNo, String accountHolderName) {
	 for(int internalIndex=0; internalIndex < accountList.length; internalIndex++) {
		 if (accountList[internalIndex].getAccountNo() == accountNo) {
	        accountList[internalIndex].setAccountHolderName(accountHolderName);;
	        return accountList;
		 }
	 }
	 throw new RuntimeException("Account Doesn't Exist");
}


public static void main(String[] args) {
   BankAccountList list = new BankAccountList();
   list.addNewBankAccount(new SavingsAccount("Shweta",5000.0));
   list.addNewBankAccount(new SavingsAccount("Dhanya",4000.0));
   list.addNewBankAccount(new SavingsAccount("Khushboo",4500.0));
   
  /* for(BankAccount acc:list.getAllBankAccount()) {
	   System.out.println(acc);
   }
   
   System.out.println(list.getAccountById(3)); */
   
   /*for(BankAccount acc:list.updateBankAccount(3,"Neha")) {
	   System.out.println(acc);
   }*/
   
   for(BankAccount acc:list.removeBankAccountById(3)) {
	   System.out.println(acc);
   }

}

		 
	 
 
		
	
	

	
}
