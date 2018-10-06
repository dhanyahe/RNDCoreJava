package com.dany.test;

import com.dany.pojo.MyDate;

public class MyDateTestRecords {
	
	public MyDate startDate;
	public MyDate endDate;
	public long expectedResult;
	
	public MyDateTestRecords(MyDate startDate, MyDate endDate,long expectedResult) {
		
		this.startDate = startDate;
		this.endDate = endDate;
		this.expectedResult = expectedResult;
	}
	
	

}
