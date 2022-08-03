package com.JAVA8.Intermediate;

import java.util.List;

import com.JAVA8.model.Employee;

public class limit {

	public static void main(String[] args) {
		List<Employee> list=List.of(new Employee("sai", "sai@gmail.com", 1234567890L, "india" , 50000.0), new Employee("chiranjeevi", "chiranjeevi@gmail.com", 9087654321L,"US", 25000.0),
				new Employee("Nooruddin", "Nooruddin@gmail.com",8328474317L, "india", 52500.0),new Employee("samiulla", "samiulla@gmail.com", 9030505333L, "italy", 100000.0),
				new Employee("Noorjahan", "Noorjahan@gmail.com", 8466909090L, "arab", 40000.0),new Employee("Zammruth", "Zammruth@gmail.com", 9398762600L, "japan", 7000),
				new Employee("baji", "Baji123@gmail.com", 8690248234L, "chaina", 15000.0),new Employee("asif", "asif@gamil.com", 8214324567L, "paris", 25000.0),
				new Employee("Abhi", "Abhi@gmail.com", 9898765679L, "africa", 25000.0),new Employee("rohit", "rohit@gmail.com", 678901234L, "india", 50000.0),
				new Employee("satyaBratha", "satyaBratha877@gmail.com", 7890654321L, "German", 70000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0),new Employee("Twinkle", "Twinkle@gmail.com", 9977885467L, "IceLand", 150000.0));
		
		// limit is used -> It will truncate the remaining elements from the stream.
		//Note: limit() is suitable for sequential streams and cannot give good performance results for parallel streams.
		
		list.stream().limit(2).map(Employee::getName).forEach(System.out::println);
		
		// the results will be only 2 objects cuz we limit the number of records pass is 2 only
	}

}
