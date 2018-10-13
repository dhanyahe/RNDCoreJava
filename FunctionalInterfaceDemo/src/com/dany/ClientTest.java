package com.dany;

import java.util.ArrayList;
import java.util.List;


public class ClientTest {

	public static void main(String[] args) {
		//createThreadUsingAnonymousClass();
		createThreadUsingLambdaExpression();
		
		List<String> name=new ArrayList<>();
		name.add("s1");
		name.add("s2");
		
		//name.forEach((name1)->System.out.println(name));
		//name.forEach((name1)->System.out.println(name));
		name.forEach(System.out::println);
	}
	
	private static void createThreadUsingLambdaExpression() {
		Runnable r=	() -> {System.out.println("My Task is executing");
		};
		Thread thread=new Thread(r);
		thread.start();
	}

	@SuppressWarnings("unused")
	private static void createThreadUsingAnonymousClass() {
		Runnable r=	new Runnable() {

			@Override
			public void run() {
				System.out.println("My Task is executing");
			}
			
		};
		Thread thread=new Thread(r);
		thread.start();
	}
}

