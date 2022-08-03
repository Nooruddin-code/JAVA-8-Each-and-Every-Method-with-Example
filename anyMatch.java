package com.JAVA8.TerminalFunctions;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class anyMatch {
	public static void main(String[] args) {
		Stream<Integer> list = Stream.of(1232312,413,4,235,43,5,34,6,4356,0,354,7,64,2345,23,53532465,426,345,7,35,7,354,67,234,6,234,6,245,7,45,7,56,4867,7,68);
		
		// here we are using the anyMatch from stream of data , anyMatch is a terminal it take predicate as input
		// there the list contains that objects of integer not primitive number
		list.peek(System.out::println).anyMatch(predicate -> predicate.equals(0));
		
		System.out.println("___________________________________________________________________________");
		// as soon as it find the condition is true i will stop the parsing the list // we can use intStream method for primitive number or values
		IntStream.of(1232312,413,4,235,43,5,34,6,4356,0,354,7,64,0,2345,23,53532465,426,345,7,35,7,354,67,234,6,234,6,245,7,45,7,56,4867,7,68)
				.peek(System.out::println)
				.anyMatch(predicate-> predicate == 0);
		
		System.out.println("___________________________________________________________________________");
		
		long start = System.currentTimeMillis();
		List.of("java", "python","data Science","analysis","c","c#").stream().peek(System.out::println).anyMatch(predicate->predicate.equals("data Science"));
		long End = System.currentTimeMillis();
		System.err.println("Excution of  Stream take time is ->" +(End-start));
		
		System.out.println("___________________________________________________________________________");
		long ExcutionStart = System.currentTimeMillis();
		java.util.List.of("java", "python","data Science","analysis","c","c#").parallelStream().peek(System.out::println).anyMatch(predicate->predicate.equals("c#"));
		long ExcutionEnd = System.currentTimeMillis();
		System.err.println("Excution of parallel Stream take time is ->" +(ExcutionEnd-ExcutionStart));
	}

}
