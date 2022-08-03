package com.JAVA8.Intermediate;

import java.util.List;

import com.JAVA8.model.Employee;

public class skip {

	public static void main(String[] args) {
		List<Employee> list=List.of(new Employee("sai", "sai@gmail.com", 1234567890L, "india" , 50000.0), new Employee("chiranjeevi", "chiranjeevi@gmail.com", 9087654321L,"US", 25000.0),
				new Employee("Nooruddin", "Nooruddin@gmail.com",8328474317L, "india", 52500.0),new Employee("samiulla", "samiulla@gmail.com", 9030505333L, "italy", 100000.0),
				new Employee("Noorjahan", "Noorjahan@gmail.com", 8466909090L, "arab", 40000.0),new Employee("Zammruth", "Zammruth@gmail.com", 9398762600L, "japan", 7000),
				new Employee("baji", "Baji123@gmail.com", 8690248234L, "chaina", 15000.0),new Employee("asif", "asif@gamil.com", 8214324567L, "paris", 25000.0),
				new Employee("Abhi", "Abhi@gmail.com", 9898765679L, "africa", 25000.0),new Employee("rohit", "rohit@gmail.com", 678901234L, "india", 50000.0),
				new Employee("satyaBratha", "satyaBratha877@gmail.com", 7890654321L, "German", 70000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0));
		
		//This method skips the given n elements and returns a Stream. This is the most useful 
		//when want to perform any operations on last n records or lines from a List or Stream.
		
		list.stream().parallel().map(Employee::getName).peek(System.out::println).skip(4).forEach(System.err::println);
		
		// i will drop first 4 elements and perform on >4 
	}

}



