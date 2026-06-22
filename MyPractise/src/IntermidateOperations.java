import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermidateOperations {
	public static void main(String[] args) {
		// create a filter method
        List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        
        // create a map method
        List<Integer> number=Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square
            = number.stream().map(x -> x*x).collect(
                Collectors.toList());
        System.out.println(square);
        
        // demonstration of sorted method
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream");
        List<String> show = names.stream().sorted().collect(
            Collectors.toList());
        System.out.println(show);

	}

}
