import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {
	public static void main(String[] args) {
		  List<Integer> numbers= Arrays.asList(2, 3, 4, 3);
		  // collect method returns a set
        Set<Integer> squareSet
            = numbers.stream()
                  .map(x -> x * x)
                  .collect(Collectors.toSet());
        System.out.println(squareSet); 
        
        // forEach method 
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        number.stream()
            .map(x -> x * x)
            .forEach(y -> System.out.println(y));     
        
        // demonstration of reduce method
        int even = number.stream()
                       .filter(x -> x % 2 == 0)
                       .reduce(0, (ans, i) -> ans + i);
 
        System.out.println(even);
	}

}
