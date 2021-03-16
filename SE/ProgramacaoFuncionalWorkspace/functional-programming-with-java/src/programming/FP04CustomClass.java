package programming;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
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

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 90, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000)

		);
		Predicate< Course> maiorQue90Predicado = x -> x.getReviewScore()>90;
		Predicate<Course> maiorQue95Predicado = x -> x.getReviewScore()>95;
		Predicate<Course> menorQue90Predicado = x -> x.getReviewScore()<90;
		Predicate<Course> menorQue91Predicado = x -> x.getReviewScore()<91;
		
		/*System.out.println(
		courses.stream().allMatch(maiorQue95Predicado));
		System.out.println(
				courses.stream().anyMatch(menorQue91Predicado ));*/
		
		Comparator<Course> comparandoPorEstudantes = Comparator.comparing(Course::getNumberOfStudents);
		Comparator<Course> comparandoPorEstudantesDecrescente = Comparator.comparing(Course::getNumberOfStudents).reversed();
		
		
		List<Course> collect = courses.stream().sorted(comparandoPorEstudantes).collect(Collectors.toList());
		List<Course> collect2 = courses.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).collect(Collectors.toList());
		
		//Limitar a 5 registros
		List<Course> collect3 = courses.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).limit(5).collect(Collectors.toList());

		//skip 3 registros
		List<Course> collect4 = courses.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).skip(3).collect(Collectors.toList());
		
		//Return o ultimo elemento da lista
		Optional<Course> collect5 = courses.stream().max(Comparator.comparing(Course::getNumberOfStudents));
		
		System.out.println(collect5);
		
		
		
		
	}
	
	

}
