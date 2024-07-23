package FunctionalPrograming;

import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOperation1 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 21, 32, 45, 22, 34, 54, 45, 22, 69);

//		sortAndPrint(numbers) ;
//		sortAndPrintUniqueNumber(numbers) ;
//		sortAndPrintUniqueNumberAndTheirSquare(numbers) ;
		printTheSquareOfNumbersOfCertainRange();

	}

	private static void printTheSquareOfNumbersOfCertainRange() {
		
		
		IntStream.range(22, 25).map(i -> i * i).forEach(i -> System.out.println(i));

	}

	private static void sortAndPrintUniqueNumberAndTheirSquare(List<Integer> numbers) {

		numbers.stream().sorted().distinct().map(i -> i * i).forEach(k -> System.out.println(k));

	}

	private static void sortAndPrintUniqueNumber(List<Integer> numbers) {

		numbers.stream().sorted().distinct().forEach(i -> System.out.println(i));
		
	}

	public static void sortAndPrint(List<Integer> numbers) {

		numbers.stream().sorted().forEach(i -> System.out.println(i));

	}
}
