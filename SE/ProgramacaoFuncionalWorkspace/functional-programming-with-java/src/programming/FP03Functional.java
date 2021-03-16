package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03Functional {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4,85, 6, 2, 4, 12, 15);
		
		//int num =numbers.stream().reduce(Integer.MIN_VALUE, (x,y) -> x>y? x:y);
		
		//System.out.println(num);
		
		predicado(numbers, x -> x%2==0);
	
	}

	private static void predicado(List<Integer> numbers,Predicate<Integer> logica) {
		numbers.stream().filter(logica).forEach(System.out::println);
	}


}
