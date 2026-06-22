import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {
	
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","Bala");

        // Creating a predicate to filter names starting with "A"
        Predicate<String> startsWithAPredicate = name -> name.startsWith("B");

        // Filtering names based on the predicate
        List<String> filteredNames = filterNames(names, startsWithAPredicate);

        // Printing the filtered names
        for (String name : filteredNames) {
            System.out.println(name);
        }
    }

    public static List<String> filterNames(List<String> names, Predicate<String> predicate) {
        // Creating a new list to hold the filtered names
        List<String> filteredNames = new ArrayList<>();

        // Iterating over the names and applying the predicate
        for (String name : names) {
            if (predicate.test(name)) {
                filteredNames.add(name);
            }
        }

        return filteredNames;
    }
}