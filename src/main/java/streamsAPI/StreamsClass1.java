package streamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsClass1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(11,2,2,8,3,4,4,5,6,7,8,8,9,10);
		
//		List<Integer> duplicateNumbers = new ArrayList<Integer>();
//		List<Integer> distinct = new ArrayList<Integer>();
//		
//		
//		for (int num : numbers) {
//			
//			if (distinct.contains(num)) {
//				duplicateNumbers.add(num);
//			}else {
//				distinct.add(num);
//			}
//		}
		
//		System.out.println(evenNumbers);
		
		List<Integer> evenNumbers = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<Integer> squareOfNumbers = numbers.stream().map(x -> x*x ).collect(Collectors.toList());
		System.out.println(squareOfNumbers);
		
		List<Integer> distinctOfNumber = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctOfNumber);
		
		List<Integer> sortedNumbers = numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedNumbers);
	}

}
