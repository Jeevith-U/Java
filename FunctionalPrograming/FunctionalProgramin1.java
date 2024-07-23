package FunctionalPrograming;

import java.util.List;

public class FunctionalProgramin1 {
	
	public static void main(String[] args) {
		
		List<String> animals = List.of("Rat", "Bat", "mouse", "Lion", "cat", "Monkey") ;
		
		List<Integer> number = List.of(12, 32, 14, 78, 91, 234) ;
		
//		printAnimalsEndingWithAt(animals) ;
		
		addNumbers(number) ;
		
		sumOfOddNumbers(number) ;
		
	}

	public static void sumOfOddNumbers(List<Integer> number) {
		
		int oddSum = number.stream().filter(num -> num%2 != 0)
		               .reduce(0, (num1, num2)-> num1+num2) ;
		
		System.out.println(oddSum);
	}

	public static void addNumbers(List<Integer> numbers) {
		
		int sum = numbers.stream().reduce(0, (num1, num2) -> num1+num2 );
		
		System.out.println(sum);
		
	}

	public static void printAnimalsEndingWithAt(List<String> animals) {
		
		animals.stream().filter(animal -> animal.endsWith("at"))
		                .forEach(i -> System.out.println(i));
		
	}
}
