package programming;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int numberOfStudents;

	public Course(String name, String category, int reviewScore, int numberOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.numberOfStudents = numberOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String toString() {
		return name + ":" + numberOfStudents + ":" + reviewScore;
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {

		List<Course2> courses = List.of(new Course2("Spring", "Framework", 98, 20000),
				new Course2("Spring Boot", "Framework", 95, 18000), new Course2("API", "Microservices", 97, 22000),
				new Course2("Microservices", "Microservices", 96, 25000),
				new Course2("FullStack", "FullStack", 91, 14000), new Course2("AWS", "Cloud", 92, 21000),
				new Course2("Azure", "Cloud", 90, 21000), new Course2("Docker", "Cloud", 92, 20000),
				new Course2("Kubernetes", "Cloud", 91, 20000)

		);
		Predicate<Course2> maiorQue90Predicado = x -> x.getReviewScore() > 90;
		Predicate<Course2> maiorQue95Predicado = x -> x.getReviewScore() > 95;
		Predicate<Course2> menorQue90Predicado = x -> x.getReviewScore() < 90;
		Predicate<Course2> menorQue91Predicado = x -> x.getReviewScore() < 91;

		/*
		 * System.out.println( courses.stream().allMatch(maiorQue95Predicado));
		 * System.out.println( courses.stream().anyMatch(menorQue91Predicado ));
		 */

		Comparator<Course2> comparandoPorEstudantes = Comparator.comparing(Course2::getNumberOfStudents);
		Comparator<Course2> comparandoPorEstudantesDecrescente = Comparator.comparing(Course2::getNumberOfStudents)
				.reversed();

		List<Course2> collect = courses.stream().sorted(comparandoPorEstudantes).collect(Collectors.toList());
		List<Course2> collect2 = courses.stream().sorted(Comparator.comparing(Course2::getNumberOfStudents).reversed())
				.collect(Collectors.toList());

		// Limitar a 5 registros
		List<Course2> collect3 = courses.stream().sorted(Comparator.comparing(Course2::getNumberOfStudents).reversed())
				.limit(5).collect(Collectors.toList());

		// skip 3 registros
		List<Course2> collect4 = courses.stream().sorted(Comparator.comparing(Course2::getNumberOfStudents).reversed())
				.skip(3).collect(Collectors.toList());

		// Return o ultimo elemento da lista
		Optional<Course2> collect5 = courses.stream().max(Comparator.comparing(Course2::getNumberOfStudents));

		// Filtra os cursos que tem nota acima de 95, pegue o numero de estudantes de
		// cada um e some
		int soma1 = courses.stream().filter(x -> x.getReviewScore() > 95).mapToInt(Course2::getNumberOfStudents).sum();
		
		
		//Agrupar por categoria
		Map<String, List<Course2>> collect6 = courses.stream().collect(Collectors.groupingBy(Course2::getCategory));
		
		//Agrupar por categoria, mas contar quantos tem em cada categoria
	Map<String, Long> collect7 = courses.stream().collect(Collectors.groupingBy(Course2::getCategory,Collectors.counting()));
		
		//Agrupar por categoria, mas mostrar somente o nome dos cursos
		Map<String, List<String>> collect8 = courses.stream().collect(Collectors.groupingBy(Course2::getCategory,Collectors.mapping(Course2::getName, Collectors.toList())));
		
		System.out.println(collect8);
	}

}
