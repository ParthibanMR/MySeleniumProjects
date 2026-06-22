import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ShortcircuitOperations {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstEven = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .findFirst();
        System.out.println(firstEven);
        
        List<Integer> number = Arrays.asList(1, 3, 5);
        boolean anyEven = number.stream()
                         .anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven);
	}

}
