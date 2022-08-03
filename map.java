package com.JAVA8.Intermediate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class map {
	public static void main(String[] args) {
		System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,0).peek(System.out::println)
				// will take a input type t and return type R
				  .map(x-> x%2==0)
				  .collect(Collectors.toList()));
		
	}
}
