package com.dany.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.dany.model.Student;
import com.dany.myinterface.MyInterface;

public class MyClass extends Object implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer maxNum = Collections.max(intList);
		return maxNum;
	}
	
	 public List<Student> sortStudents(List<Student> stuList){
		return stuList;
	}

}
