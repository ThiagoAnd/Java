package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No java 8 pode ser Arrays.asList
		// No java 9 tem o List.of
		//printAllNumbersInListStrutured(List.of(12,9,13,4,6,2,4,12,15));
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printAllEvenNumbersInListStrutured(numbers);

	}
	
	private static void printAllNumbersInListStrutured(List<Integer> numbers) {
		//Foca em como fazer
		for(int number: numbers) {
			System.out.println(number);
		}
	}
	
	private static void printAllEvenNumbersInListStrutured(List<Integer> numbers) {
		//Foca em como fazer
		for(int number: numbers) {
			if(number%2==0)
			 System.out.println(number);
		}
	}
	

}
