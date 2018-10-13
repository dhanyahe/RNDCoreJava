import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.dany.bank.BankAccount;


public class BankAccountMap {
	
	HashMap<Integer,BankAccount> bankAccountMap;

	public BankAccountMap() {
		
		bankAccountMap = new HashMap<>();
	}
	
	public void addBankAccountForEmployee(int empId,BankAccount acc){
		bankAccountMap.put(empId,acc);
		
	}
	
	public Set<Integer> getAllEmployeeId(){
		return bankAccountMap.keySet();
	}
	
	public Collection<BankAccount> getAllBankAccounts(){
		return bankAccountMap.values();
	}
	
	public  Set<Map.Entry<Integer,BankAccount>> getAllEmployeeBankDetails(){
		return bankAccountMap.entrySet();
	}
	

}
