package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class FP06Functional {

	public static void main(String[] args) {

		List<String> coursesMutavel = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "AZURE", "Docker",
				"Kubernetes");
		
		//Qualquer collection que vc utilizar o List.of para criar, é uma colleção imutavel, vc não pode mudar os valores
		//Mas pode transformar em array list como esta embaixo
		List<String> coursesImutavel = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "AZURE", "Docker",
				"Kubernetes");
		
		
		//coursesImutavel.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		
		
		List<String> modifyableCourses = new ArrayList<String>(coursesImutavel);
		
		modifyableCourses.replaceAll(String::toUpperCase);
		
		System.out.println(modifyableCourses);
		
		modifyableCourses.removeIf(course -> course.length() <6);
		
		System.out.println(modifyableCourses);
		
		

	}

}
