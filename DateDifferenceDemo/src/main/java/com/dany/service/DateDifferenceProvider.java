package com.dany.service;

import com.dany.pojo.MyDate;

public class DateDifferenceProvider {
	
	static final int FIRST_DAY_OF_YEAR=1;
	static final int FIRST_MONTH_OF_YEAR=1;
	static final int LAST_DAY_OF_YEAR=31;
	static final int LAST_MONTH_OF_YEAR=12;
	
	static final int DAYS_IN_NON_LEAP_YEAR=365;
	
	static final int FEB=2;
	
	
	static final int DAYS_IN_JAN=31;
	static final int DAYS_IN_FEB=28;
	static final int DAYS_IN_MAR=31;
	static final int DAYS_IN_APR=30;
	static final int DAYS_IN_MAY=31;
	static final int DAYS_IN_JUN=30;
	static final int DAYS_IN_JUL=31;
	static final int DAYS_IN_AUG=31;
	static final int DAYS_IN_SEP=30;
	static final int DAYS_IN_OCT=31;
	static final int DAYS_IN_NOV=30;
	static final int DAYS_IN_DEC=31;
	
	static int[] daysInMonth=new int[]{
		DAYS_IN_JAN,
		DAYS_IN_FEB,
		DAYS_IN_MAR,
		DAYS_IN_APR,
		DAYS_IN_MAY,
		DAYS_IN_JUN,
		DAYS_IN_JUL,
		DAYS_IN_AUG,
		DAYS_IN_SEP,
		DAYS_IN_OCT,
		DAYS_IN_NOV,
		DAYS_IN_DEC
	};
	
	
	public static long getDateDifference(MyDate startDate, MyDate endDate){
		
		if(sameDate(startDate,endDate)&& sameMonth(startDate,endDate)&&sameYear(startDate,endDate)){
			return 0;
		}
		
		else if(sameMonth(startDate,endDate)&&sameYear(startDate,endDate)){
			return endDate.getDd()-startDate.getDd();
		}
		
		else if(sameYear(startDate,endDate)&&!sameMonth(startDate,endDate)){
			return remainingDaysInMonth(startDate)+daysInIntervingMonth(startDate,endDate)+leadingMonth(endDate);	
		}
		
		else{
			return remainingDaysInYear(startDate)+daysInIntervingYear(startDate,endDate)+leadingYear(endDate);
		}
		
	}

	
	
	
	private static long leadingYear(MyDate endDate) {
		MyDate firstDateOfYear = new MyDate(FIRST_DAY_OF_YEAR, FIRST_MONTH_OF_YEAR, endDate.getYyyy());
		return remainingDaysInMonth(firstDateOfYear)+daysInIntervingMonth(firstDateOfYear,endDate)+leadingMonth(endDate);
	}

	private static int daysInIntervingYear(MyDate startDate, MyDate endDate) {
		int daysInBetween=0;
		for(int yI=startDate.getYyyy()+1;yI<endDate.getYyyy();yI++)
		{
			daysInBetween+=DAYS_IN_NON_LEAP_YEAR;
			if(isLeap(yI))
				daysInBetween+=1;
		}
		return daysInBetween;
	}
	
	
	private static boolean isLeap(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static long remainingDaysInYear(MyDate startDate) {
		MyDate lastDateOfYear=new MyDate(LAST_DAY_OF_YEAR, LAST_MONTH_OF_YEAR, startDate.getYyyy());
		return remainingDaysInMonth(startDate)+daysInIntervingMonth(startDate,lastDateOfYear)+leadingMonth(lastDateOfYear)+1;
	}

	
	
	
	private static int leadingMonth(MyDate endDate) {
		return endDate.getDd();
	}

	private static long daysInIntervingMonth(MyDate startDate, MyDate endDate) {
		long daysInBetween = 0;
		for (int mI = startDate.getMm(); mI < endDate.getMm() - 1; mI++) {
			if( mI == FEB-1 && isLeap(startDate.getYyyy()))
			{
				daysInBetween+=1;
			}
			daysInBetween += daysInMonth[mI];
			
		}
		return daysInBetween;
	}

	private static int remainingDaysInMonth(MyDate startDate) {
		int daysInBetween=0;
		daysInBetween=daysInMonth[startDate.getMm() - 1] - startDate.getDd();
		if(isLeap(startDate.getYyyy()) && startDate.getMm()==FEB)
		{
			daysInBetween+=1;
		}
		
		return daysInBetween;
	}

	private static boolean sameYear(MyDate startDate, MyDate endDate) {
		 if(endDate.getYyyy()-startDate.getYyyy()==0){
			 return true;	
		}
		 else
			 return false;
	}

	private static boolean sameMonth(MyDate startDate, MyDate endDate) {
		if(endDate.getMm()-startDate.getMm()==0){
			return true;
		}
		else
			return false;
	}

	private static boolean sameDate(MyDate startDate, MyDate endDate) {
		if(endDate.getDd()-startDate.getDd()==0){
			return true;
		}
		return false;
	}

	
	
	
	

}
