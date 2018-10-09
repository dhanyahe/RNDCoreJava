package com.dany;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamDemo1{
	public static void main(String[] args){
		
		Stream<String> s= Stream.<String>builder().add("k").add("l").build();
		s.forEach(System.out::println);
		
		
		System.out.println("----------------------------");
		Stream<String> s1=Stream.generate(()->"hi").limit(5);
		s1.forEach(System.out::println);
		
		System.out.println("----------------------------");
		Stream<Integer> s2=Stream.iterate(34, n->n*2).limit(5);
		s2.forEach(System.out::println);
		
		System.out.println("----------------------------");
		IntStream i=IntStream.rangeClosed(1,6);
		i.forEach(System.out::println);
		
		System.out.println("----------------------------");
		Random r=new Random();
		DoubleStream d=r.doubles(5);
		d.forEach(System.out::println);
		
	}

}
