package com.example.demo.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {
	
	 @MockBean
	 private PersonRepository personMock;
	 
	 @Autowired
	 private /*static*/ PersonService mockedPersonService;
	 
	 /*@Before
	 public void initialize() {
		 mockedPersonService = new PersonService();
	 }*/
	 
	 List<Person> persons = new ArrayList<Person>();
	 Person person1, person2;
	 

	 @Test
     public void create() {
		 person1= new Person("Likhitha","G.M",21);
         Mockito.when(mockedPersonService.create("Likhitha","G.M",21)).thenReturn(person1);
         assertNotNull(person1.getFirstName());
        // assertNull(person1.getAge());
         assertEquals(person1.getAge(),21);
        
	}
	 // JUnit Test Method is Declared as "private"
	 @Test
	 /*private*/ public void getAll(){ 
		 person1 = new Person("Likhitha","G.M",21);
		 persons.add(person1);
         Mockito.when(mockedPersonService.getAll()).thenReturn(persons);

	 }
	 
	 
	@Test
	/*static*/ public void getByFirstName() {
		person1 = new Person("Likhitha", "G.M", 21);
		person2 = new Person("Dhanya","Hegde",20);
		Mockito.when(mockedPersonService.getByFirstName("Likhitha")).thenReturn(person1);
		// Use of Mockito.any()
		Mockito.when(mockedPersonService.getByFirstName(Mockito.anyString())).thenReturn(person2); 

	}
	
	// fail() method throws an assertion error unconditionally
	@Test
	public void failExampleTest() {
		person1 = new Person("Likhitha","G.M",21);
		if(person1.getFirstName() == null)
			fail("person object is null");		
	}
	
	// JUnit only report the first failure in a single test
	// JUnit test method is declared to return "String"
	
/*	@Test(expected = Exception.class)
	public String getByFirstName1(){
		String message = "Hello World";
		assertEquals(12, message.length());
		return message;
	}
*/


}
