package com.dany;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sean");
		list.add("Martin");
		list.add("Frank");
		list.add("Andrew");
		
		/*Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();
		long count = distinct.count();
		System.out.println(count);
		*/
		
		Stream<String> stream = list.stream();
		long count = list.stream().distinct().distinct().count();
		System.out.println(count);
		
		boolean anyMatch = list.stream().anyMatch(s->s.contains("ra"));
		System.out.println(anyMatch);
	}

}