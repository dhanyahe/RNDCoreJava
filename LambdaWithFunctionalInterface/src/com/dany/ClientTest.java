package com.dany;

public class ClientTest {

	public static void main(String[] args) {
	  MyInterface1 myInterface=()->System.out.println("This method executes using lambda");
	  myInterface.method1();	
	  
	  System.out.println("----------------------");
	  
	 /* MyInterface2 myInterface2=(String name)->System.out.println("Your name is:"+name);
	  myInterface2.method2("Sowmya");   OR*/
	  
	  MyInterface2 myInterface2=name->System.out.println("Your name is:"+name);
	  myInterface2.method2("dany");
	  
	  System.out.println("----------------------");
	  MyInterface3 myInterface3=(String name,int age)->{System.out.println("Your name is :"+name);
	  System.out.println("You are : "+age +"years old");
	  };
	  
	  myInterface3.method3("dany", 21);
	}
}
	
	/* MyInterface1 myInterface=new MyInterface1() {

			@Override
			public void method1() {
				System.out.println("This ,method executes using lambda");
			}
			  
		  };
		  myInterface.method1();
		
		}*/


