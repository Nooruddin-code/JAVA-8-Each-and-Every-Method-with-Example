package com.JAVA8.TerminalFunctions;

import java.util.List;
import java.util.stream.Collectors;

import com.JAVA8.model.Employee;

public class collect {
	public static void main(String[] args) {
		List<Employee> list=List.of(new Employee("sai", "sai@gmail.com", 1234567890L, "india" , 50000.0), new Employee("chiranjeevi", "chiranjeevi@gmail.com", 9087654321L,"US", 25000.0),
				new Employee("Nooruddin", "Nooruddin@gmail.com",8328474317L, "india", 52500.0),new Employee("samiulla", "samiulla@gmail.com", 9030505333L, "italy", 100000.0),
				new Employee("Noorjahan", "Noorjahan@gmail.com", 8466909090L, "arab", 40000.0),new Employee("Zammruth", "Zammruth@gmail.com", 9398762600L, "japan", 7000),
				new Employee("baji", "Baji123@gmail.com", 8690248234L, "chaina", 15000.0),new Employee("asif", "asif@gamil.com", 8214324567L, "paris", 25000.0),
				new Employee("Abhi", "Abhi@gmail.com", 9898765679L, "africa", 25000.0),new Employee("rohit", "rohit@gmail.com", 678901234L, "india", 50000.0),
				new Employee("satyaBratha", "satyaBratha877@gmail.com", 7890654321L, "German", 70000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0));

		System.out.println(list.parallelStream()
				.collect(Collectors.
						groupingBy(Employee::getSalary,
								Collectors.mapping(Employee::getName,Collectors.toList()))));

		System.err.println(list.parallelStream()
				.collect(Collectors.
						groupingBy(Employee::getSalary,
								Collectors.mapping(Employee::getEmail,Collectors.toUnmodifiableSet()))));

		System.out.println(list.parallelStream()
				.collect(Collectors
						.groupingBy(Employee::getCountry,
								Collectors.mapping(Employee::getName, Collectors.toList()))));

		System.err.println(list.parallelStream()
				.collect(Collectors
						.partitioningBy(e->e.getSalary() >= 100000.0
						,Collectors.mapping(Employee::getName, Collectors.toUnmodifiableList()))));

		System.out.println(list.stream().collect(Collectors.mapping(Employee::getName, Collectors.toSet())));
	}
}
