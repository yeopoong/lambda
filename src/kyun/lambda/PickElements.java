package kyun.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PickElements {
    private final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    
    private final static Function<String, Predicate<String>> startsWithLetter =
    	    letter -> name -> name.startsWith(letter);

    public static void main(String[] args) {
        final List<String> friendsStartsWithN = friends.stream()
                                                       .filter(checkIfStartWith("N"))
                                                       .collect(Collectors.toList());
        System.out.println(friendsStartsWithN);

        final List<String> friendsStartsWithB = friends.stream()
                                                       .filter(checkIfStartWith("B"))
                                                       .collect(Collectors.toList());
        System.out.println(friendsStartsWithB);
    }

    public static Predicate<String> checkIfStartWith(final String letter) {
        return name -> name.startsWith(letter);
    }
}
