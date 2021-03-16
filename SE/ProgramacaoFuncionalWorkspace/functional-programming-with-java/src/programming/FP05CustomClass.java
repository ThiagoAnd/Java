package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Course2 {
	private String name;
	private String category;
	private int reviewScore;
	private int numberOfStudents;

	public Course2(String name, String category, int reviewScore, int numberOfStudents) {
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

public class FP05CustomClass {

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 90, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000)

		);
		
		List<String> courseNames = List.of("Spring","Spring Boot","Microservices","FullStack","Azure","Kubernetes");
		
		//courses.stream().filter(x -> x.getReviewScore() > 95).collect(Collectors.mapping(Course::getName, Collectors.toList())).forEach(System.out::println);
		
		//IntStream.range(0, 10).forEach(System.out::println); O peek, só mostra como esta a sequencia sem fazer nada
		//System.out.println(IntStream.iterate(1, e -> e+2).limit(10).peek(System.out::println).sum());
		
		//Para converter para uma lista uma stream primitiva, vc deve usar o boxed()
		//IntStream.iterate(1, e -> e*2).limit(10).boxed().collect(Collectors.toList());
		
		courseNames.stream().collect(Collectors.toList()).forEach(System.out::println);
		String string1 = courseNames.stream().collect(Collectors.joining(" -- "));
		System.out.println(string1);
		
		 List<String> stringList = courseNames.stream().map(course-> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
		 
		 System.out.println(stringList);
		
		
		
	}

}
