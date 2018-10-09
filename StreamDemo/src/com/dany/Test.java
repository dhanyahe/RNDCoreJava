package com.dany;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		 Stream<Integer> s=Stream.iterate(0,i->i+1);
		 List<Integer> c=s.limit(10).collect(Collectors.toList());
		 c.forEach(System.out::println);
	}

}
