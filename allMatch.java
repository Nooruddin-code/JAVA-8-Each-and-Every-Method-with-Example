package com.JAVA8.TerminalFunctions;

import java.util.stream.IntStream;

public class allMatch {

	public static void main(String[] args) {
	IntStream.of(2,4,5,6,8,10,11,13).peek(System.out::println).allMatch(n->n%2==0);
	
	}

}
