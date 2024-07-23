package FunctionalPrograming;

import java.util.List;

public class TerminalOperation1 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10, 21, 34, 54, 67,92) ;
		
		findMaximumNumber(numbers) ;
	}

	private static void findMaximumNumber(List<Integer> numbers) {
		 
		System.out.println(numbers.stream().max((num1, num2) -> Integer.compare(num1, num2)).get());
		
	}
}
