package com.dany;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferencingAStream {
	public static void main(String[] args) {
		/*Stream<String> s=Stream.of("a","b","c").filter(e->e.contains("b"));
		Optional<String> findAny=s.findAny();
		System.out.println(findAny.get());
		Optional<String> f=s.findFirst();*/
		
List<String> l=Stream.of("a","b","c").filter(e->e.contains("c")).collect(Collectors.toList());
		Optional<String> findAny=l.stream().findAny();
		System.out.println(findAny.get());
		Optional<String> f=l.stream().findFirst();
		System.out.println(f.get());
	}
}
