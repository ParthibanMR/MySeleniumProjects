import java.util.ArrayList;
import java.util.List;

public class forEachExample {
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		//using lambda expression
		fruits.forEach(fruit->System.out.println(fruit));
		//using method reference
		fruits.forEach(System.out::println);
	}

}
