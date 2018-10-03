package com.dany.bank;

public class CurrentAccountv2 extends CurrentAccount implements Insurance {
	@Override
	public String getInsuranceName() {
		
		return "CurrentAccount Insurance" ;
	}

	@Override
	public int getInsuranceId() {
		
		return 101;
	}

}
