package com.dany.bank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashmapAssgn {
	
	public static void main(String[] args){
	
		
		HashMap<Integer, String> hashm = new HashMap<Integer, String>();
		hashm.put(3,"John Doe");
		hashm.put(1,"Tom Smith");
		hashm.put(2,"Jane Baker");
		hashm.put(4,"Tod Hall");
		hashm.put(5,"Ralph Smith");
		
		System.out.print(hashm.get(1));
		System.out.print(hashm.get(2));
		System.out.print(hashm.get(3));
		System.out.print(hashm.get(4));
		System.out.print(hashm.get(5));
		
		
		System.out.println("\n===========================================\n");
		Set<Map.Entry<Integer, String>> set = hashm.entrySet();
		
		for(Map.Entry<Integer, String> m : set) {
			System.out.print(m.getKey() + " : ");
			System.out.println(m.getValue());
			}
		
		System.out.println("\n===========================================\n");
		
		 System.out.println("Size of HashMap : " + hashm.size());
		 
		 System.out.println("\n===========================================\n");
		 
		 hashm.clear();
		 System.out.print(hashm.get(1));
			System.out.print(hashm.get(2));
			 System.out.println("\n===========================================\n");
			 hashm.put(3,"John Doe");
				hashm.put(1,"Tom Smith");
				hashm.put(2,"Jane Baker");
				hashm.put(4,"Tod Hall");
				hashm.put(5,"Ralph Smith");
				System.out.println("Keys\n");
				for(Map.Entry<Integer, String> m : set) {
					System.out.print(m.getKey() + " \n");
					
					}
				System.out.println("Values\n");
				for(Map.Entry<Integer, String> m : set) {
					
					System.out.println(m.getValue()+"\n");
					}
				System.out.println("\n===========================================\n");	
				
				
				Map<Integer, String> map = new TreeMap<Integer, String>(hashm); 
		         System.out.println("After Sorting by Keys:");
		         Set set2 = map.entrySet();
		         Iterator iterator2 = set2.iterator();
		         while(iterator2.hasNext()) {
		              Map.Entry me2 = (Map.Entry)iterator2.next();
		              System.out.print(me2.getKey() + ": ");
		              System.out.println(me2.getValue());
		         }
		         System.out.println("\n===========================================\n");	
		         
		         
		         
				
	
	}
}
