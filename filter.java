package com.JAVA8.Intermediate;

import java.util.stream.Stream;

public class filter {

	public static void main(String[] args) {
		Stream<Integer> stream= Stream.of(2,41234,134,32,423,45,3,5,34,2,0,5,342,5,432,5,432,5,432,6,42,6,452,6,4356,546,5,7,65,7,65,7,56,876);
		stream.filter(x->x%2==1)
			  .forEach(x-> System.out.println("it's a Not a EVEN number from Stream ->"+x));
		
	}

}
