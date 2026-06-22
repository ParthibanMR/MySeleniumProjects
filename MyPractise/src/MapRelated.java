import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRelated {
	public static void main(String[] args) {
		Map<Integer, String> mp=new LinkedHashMap();
		
		mp.put(1, "parthu");
		mp.put(2, "ini");
		mp.put(3, "karthi");
		
		for (Entry<Integer, String> m: mp.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue()+"\n");
		}
		
	Collection<String> values = mp.values();
	System.out.println(values);
	
	Set<Integer> keySet = mp.keySet();
	System.err.println(keySet);
	
	
	}

}
