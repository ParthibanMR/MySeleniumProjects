package mockpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsChecking {
	public static void main(String[] args) {
		/*
		 * String[] s=new String[2]; s[0]="java"; s[1]="parthu";
		 * System.out.println(Arrays.toString(s));
		 * 
		 * for (int i = 0; i < s.length; i++) { System.out.println(s[i]); } for (String
		 * each : s) { System.out.println(each); }
		 */		
		
		//Arraylist
		/*
		 * ArrayList<String> a=new ArrayList<>(); a.add("java"); System.out.println(a);
		 * 
		 * for (int i = 0; i < a.size(); i++) { System.out.println(a.get(i)); }
		 * 
		 * for (String each1 : a) { System.out.println(each1); }
		 */
		
		//Map
		Map<String, String> m=new HashMap<>();
		m.put("1", "Java");
		m.put("2", "Selenium");
		
	//	Set<String> keySet = m.keySet();
		System.out.println(m.values());
		
		Set<Entry<String, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
	
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}

}
