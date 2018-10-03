package com.dany.bank;

public class SavingsAccountv2 extends SavingsAccount implements Insurance {
	
	
	@Override
	public String getInsuranceName() {
		
		return "Savings Account Insurance";
	}

	@Override
	public int getInsuranceId() {
		
		return 102;
	}
}
