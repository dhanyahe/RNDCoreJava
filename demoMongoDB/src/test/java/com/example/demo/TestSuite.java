package com.example.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.example.demo.model.PersonTest;
import com.example.demo.service.PersonServiceTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	   PersonTest.class,
	   PersonServiceTest.class
	})
public class TestSuite {

	
}
