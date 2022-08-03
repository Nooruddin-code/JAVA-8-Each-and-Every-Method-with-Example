package com.JAVA8.Intermediate;

import java.util.stream.Stream;

public class distinct {
	public static void main(String[] args) {
		Stream<Integer> stream= Stream.of(2,41234,134,32,423,45,3,5,34,2,0,5,342,5,432,5,4535
											,45,56,7,68,685,6345,23534,54,65,6345,345,0,0,0,0,0,0,20,202,02,02,
											02,02,2,2,2,2,32,5,432,6,42,6,452,6,4356,546,5,7,65,7,65,7,56,876);
		
			stream.distinct().forEach(System.out::println);
	}
}
