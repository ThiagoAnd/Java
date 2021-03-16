package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03MethodReferences {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "AZURE", "Docker",
				"Kubernetes");

		courses.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

	}

}
