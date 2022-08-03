package com.JAVA8.TerminalFunctions;

import java.util.List;

import com.JAVA8.model.Employee;

public class forEachOrdered {
	public static void main(String[] args) {
		/* whereas the first one is not guaranted since the order is not kept. 
		forEachOrdered will processes the elements of the stream in the order specified by its source, 
		regardless of whether the stream is sequential or parallel.*/

		List<Employee> list=List.of(new Employee("sai", "sai@gmail.com", 1234567890L, "india" , 50000.0), new Employee("chiranjeevi", "chiranjeevi@gmail.com", 9087654321L,"US", 25000.0),
				new Employee("Nooruddin", "Nooruddin@gmail.com",8328474317L, "india", 52500.0),new Employee("samiulla", "samiulla@gmail.com", 9030505333L, "italy", 100000.0),
				new Employee("Noorjahan", "Noorjahan@gmail.com", 8466909090L, "arab", 40000.0),new Employee("Zammruth", "Zammruth@gmail.com", 9398762600L, "japan", 7000),
				new Employee("baji", "Baji123@gmail.com", 8690248234L, "chaina", 15000.0),new Employee("asif", "asif@gamil.com", 8214324567L, "paris", 25000.0),
				new Employee("Abhi", "Abhi@gmail.com", 9898765679L, "africa", 25000.0),new Employee("rohit", "rohit@gmail.com", 678901234L, "india", 50000.0),
				new Employee("satyaBratha", "satyaBratha877@gmail.com", 7890654321L, "German", 70000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0));

		// i will gather all the processing in sequence which is started at the of pipe line even it will in parallel stream also
		list.parallelStream().forEachOrdered(System.out::println);


	}
}
