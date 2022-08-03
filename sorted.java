package com.JAVA8.Intermediate;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sorted {
	public static void main(String[] args) {
		
		Stream<Integer> stream= Stream.of(2,41234,134,32,423,45,3,5,34,2,0,5,342,5,432,5,432,5,432,6,42,6,452,6,4356,546,5,7,65,7,65,7,56,876);
		// natural order using sort in stream	
		// stream.sorted().forEach(System.out::println);
		
		System.out.println("__________________________________________________________");
//		Set<Double> list = stream.mapToDouble(x->x.doubleValue()).boxed().collect(Collectors.toSet());
		Set<Long> list = stream.mapToLong(x->x.longValue()).boxed().collect(Collectors.toSet());
		// custom order using comparator also we can do it
		System.out.println(list.parallelStream().sorted(Comparator.reverseOrder()).collect(Collectors.averagingLong(Long::longValue)));
	}
}
