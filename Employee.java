package com.JAVA8.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 	List<Employee> list=List.of(new Employee("sai", "sai@gmail.com", 1234567890L, "india" , 50000.0), new Employee("chiranjeevi", "chiranjeevi@gmail.com", 9087654321L,"US", 25000.0),
				new Employee("nooruddin", "Nooruddin@gmail.com",8328474317L, "india", 52500.0),new Employee("samiulla", "samiulla@gmail.com", 9030505333L, "italy", 100000.0),
				new Employee("noorjahan", "Noorjahan@gmail.com", 8466909090L, "arab", 40000.0),new Employee("nammruth", "Zammruth@gmail.com", 9398762600L, "japan", 7000),
				new Employee("baji", "Baji123@gmail.com", 8690248234L, "chaina", 15000.0),new Employee("asif", "asif@gamil.com", 8214324567L, "paris", 25000.0),
				new Employee("abhi", "Abhi@gmail.com", 9898765679L, "africa", 25000.0),new Employee("rohit", "rohit@gmail.com", 678901234L, "india", 50000.0),
				new Employee("satyaBratha", "satyaBratha877@gmail.com", 7890654321L, "German", 70000.0),new Employee("twinkle", "twinkle@gmail.com", 9977885467L, "IceLand", 150000.0),new Employee("twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0));
 
 	Generate range of integer
 		List<Integer> ListInt = IntStream.range(1, 1000).boxed().collect(Collectors.toList());
 		
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String Name;
	private String Email;
	private long PhoneNo;
	private String Country;
	private double Salary;
}