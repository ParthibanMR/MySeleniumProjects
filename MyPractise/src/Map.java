import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Map {
	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap();
		m.put(1, "exe1");
		m.put(2, "exe2");
		m.put(3, "exe3");
		
//		System.out.println(m);
		
//		Set<Integer> keySet = m.keySet();
//		System.out.println(keySet);
		
//		Collection<String> values = m.values();
//		System.out.println(values);
		
//	     Set<Entry<Integer,String>> s =m.entrySet();
//	     System.out.println(s);
     
		  for (Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
	//		System.out.println(key);
			String value = entry.getValue();
	//		System.out.println(value);
			System.out.println(key+":"+value);
		}
	}

}
