package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<Integer> doubledNumbers = doubledList(numbers);
		
		System.out.println(doubledNumbers);
//		int sum = somaNumerosImpares(numbers);
//		System.out.println(sum);
	}

	private static List<Integer> doubledList(List<Integer> numbers) {
		return numbers.stream().map(x -> x*x).collect(Collectors.toList());
	}

	private static int sum(int a, int b) {
		System.out.println("\nA = " + a + "\nB= " + b);
		return a + b;

	}

	private static int addListFunctional(List<Integer> numbers) {

		return numbers.stream().reduce(0, FP02Functional::sum);

	}

	private static int addLambdaListFunctional(List<Integer> numbers) {

		// Outro modo. Integer ja tem um metodo para fazer soma
		// return numbers.stream().reduce(0,Integer::sum);
		return numbers.stream().reduce(0, (x, y) -> x + y);

	}

	// Soma dos numeros impares

	private static int somaNumerosImpares(List<Integer> numbers) {

		return numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
	}

	// Printar numeros distintos

	private static void printarNumerosDistintos(List<Integer> numbers) {

		 numbers.stream().distinct().forEach(System.out::println);
		
	}
	
	// Printar numeros distintos

		private static void ordenarNumeros(List<Integer> numbers) {

			 numbers.stream().sorted().forEach(System.out::println);
			
		}

}
