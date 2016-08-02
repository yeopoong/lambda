package kyun.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream {
	
	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5,6).stream()
								  .map(i -> i * i)
								  .skip(1)
								  .limit(2)
								  .filter(i -> 4 < i)
								  .forEach(System.out::println);

		Arrays.asList(1,2,3,4,5,6).stream()
								  .map(i -> i * i)
								  .skip(1)
								  .limit(2)
								  .filter(i -> 4 < i)
								  .reduce((a, b) -> a + b);

		Arrays.asList(1,2,3,4,5,6).stream()
								  .collect(Collectors.toList());
	}
}
