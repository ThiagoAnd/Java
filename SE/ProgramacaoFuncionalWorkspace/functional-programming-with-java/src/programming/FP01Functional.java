package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No java 8 pode ser Arrays.asList
		// No java 9 tem o List.of
		List<Integer> number = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//		printAllNumbersInListFunctionalMelhorado(number); 
		printAllMapEvenLambdaNumbersInListFunctionalMelhorado(number);

	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// Functional foca em oque fazer

		// Aqui primeiro convertemos a lista em uma stream de numeros, uma sequencia de
		// numeros
		// Fazendo isso vc pode especificar o que fazer com cada um dos numeros

		// Pega os numeros > converte para uma sequencia > para cada um deles > pegue o
		// metodo print da função FP01
		numbers.stream().forEach(FP01Functional::print);
	}

	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctionalMelhorado(List<Integer> numbers) {

		// Pega a classe System.out e usa o metodo println
		numbers.stream().forEach(System.out::println);
	}

	private static void printAllEvenNumbersInListFunctionalMelhorado(List<Integer> numbers) {

		// Pega a classe System.out e usa o metodo println
		numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
	}

	private static void printAllEvenLambdaNumbersInListFunctionalMelhorado(List<Integer> numbers) {

		// Pega a classe System.out e usa o metodo println
		numbers.stream()
		.filter(number -> number % 2 == 0)
		.forEach(System.out::println);
	}

	private static void printAllMapEvenLambdaNumbersInListFunctionalMelhorado(List<Integer> numbers) {

		// Pega a classe System.out e usa o metodo println
//		numbers.stream().forEach(number -> System.out.println(number*number));
		numbers.stream().map(number -> number * number+" Testando concatenação").forEach(System.out::println);
	}

}
