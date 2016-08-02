package kyun.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	
	 private final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
	
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
		
		friends.stream()
        	   .map(String::toUpperCase)
               .forEach(System.out::println);
	}
}
