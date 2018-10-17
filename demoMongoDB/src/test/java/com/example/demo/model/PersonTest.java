package com.example.demo.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PersonTest {
	
	
	@BeforeClass
	public static void beforeClassOfTest()
	{
		System.out.println("Testing started");
	}
	
	@AfterClass
	public static void afterClassOfTest()
	{
		System.out.println("Test ended");
	}
	
	@Before
	public void beforeEveryTest()
	{
		System.out.println("Test execution started");
	}

	
	@After
	public void afterEveryTest()
	{
		System.out.println("Test execution ended");
	}

	// Test Getters and Setter and default Constructors
	//AssertEquals
	@Test
	public void testPerson() {
		Person person = new Person();
		person.setFirstName("Subroto");
		person.setLastName("Roy");
		person.setAge(22);
		assertEquals("Subroto", person.getFirstName());
		assertEquals("Roy", person.getLastName());
		assertEquals(22, person.getAge());
	}

	// Test Parametrised Constructors
	@Test
	public void testPersonContructor() {
		Person person = new Person("Subroto", "Roy", 22);
		assertEquals("Subroto", person.getFirstName());
		assertEquals("Roy", person.getLastName());
		assertEquals(22, person.getAge());
	}

	// Test toString() method
	//How Should We Ignore Or Avoid Executing Set Of Tests ?
	@Ignore
	@Test
	public void ignoredTestToString() {
		Person person = new Person("firstName", "lastName", 22);
		assertEquals("Person [firstName=firstName, lastName=lastName, age=22]", person.toString());
	}
	
	@Test
	public void testToString() {
		Person person = new Person("firstName", "lastName", 22);
		assertEquals("Person [firstName=firstName, lastName=lastName, age=22]", person.toString());
	}
	
	@Test
	public void testToStringPrintingConsole() {
		Person person = new Person("firstName", "lastName", 22);
		//assertEquals("Person [firstName=firstName, lastName=lastName, age=22]", person.toString());
		System.out.println(person.toString());
	}
	
	//How To Create A Junit To Make Sure That The Tested Method Throws An Exception?
    @Test (expected = IllegalStateException.class)
    public void testNegativeAge()
    {
    	Person person = new Person();
    	person.setAge(-10);
    }

    //
    /*@Test
    public String testToStringReturningString() {
		Person person = new Person("firstName", "lastName", 22);
		assertEquals("Person [firstName=firstName, lastName=lastName, age=22]", person.toString());
		return null;
	}*/
	

}
