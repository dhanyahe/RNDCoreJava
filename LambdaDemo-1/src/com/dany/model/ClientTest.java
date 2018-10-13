package com.dany.model;

public class ClientTest {

	public static void main(String[] args) {
		
		//createThreadWithoutLambda();
		createThreadUsingLambda();
	}

	private static void createThreadUsingLambda() {
		Runnable r=()->System.out.println("My task is executing");
		Thread thread1=new Thread(r);
		thread1.start();
	}

	@SuppressWarnings("unused")
	private static void createThreadWithoutLambda() {
		MyThread myThread = new MyThread();
		
		Thread thread1=new Thread(myThread);
		thread1.start();
	}

}
