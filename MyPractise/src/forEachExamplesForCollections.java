import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Map;

public class forEachExamplesForCollections {
	public static void main(String[] args) {
		//list
		List<String> names=new ArrayList<>(Arrays.asList("Arun","deva","mark"));
		names.forEach(System.out::println);
		//set
		List<String> cities=new ArrayList<>(Arrays.asList("Chennai","Mumbai","Delhi"));
		cities.forEach(System.out::println);
		//Map
		Queue<String> items=new ArrayDeque<>(Arrays.asList("product1","product1","product1"));
		cities.forEach(System.out::println);
		//Map
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1, "Dog");
		mp.put(2, "Cats");
		mp.put(3, "panda");
		mp.forEach((key, value)->System.out.println(key+" "+value));
		//entry set
		mp.entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
	}

}
