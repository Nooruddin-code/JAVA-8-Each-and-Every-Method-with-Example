package com.JAVA8.Intermediate;

import java.util.stream.Stream;

public class flatMap {

	public static void main(String[] args) {
		// using primitive data types
		Stream<Integer> array1= Stream.of(2,4,6,8,0);
		Stream<Integer> array2= Stream.of(3,5,1,7,9);
		Stream.of(array1,array2)
		// combine 2 stream into single stream then we perform only even numbers sort using filter
		.flatMap(x->x.sequential())
		.filter(x->x%2==0)
		.forEach(System.out::println);

	}

}
