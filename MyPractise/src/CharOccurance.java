import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CharOccurance {
	public static void main(String[] args) {
		
		HashMap <Integer, String> mp=new HashMap<>();
		
		mp.put(1, "Sona");
		mp.put(2, "Sona2");
		mp.put(3, "Sona3");
		
		for (Entry<Integer, String> s : mp.entrySet()) {
			Integer key = s.getKey();
			String value = s.getValue();
			
			System.out.println(key + value);
		}
		
	}

}
