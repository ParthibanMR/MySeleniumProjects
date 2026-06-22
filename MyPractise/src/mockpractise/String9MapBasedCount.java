package mockpractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class String9MapBasedCount {
	public static void main(String[] args) {
		String str="hi java my";
		int count=0;
		
		String[] split = str.split(" ");
		
		Map<Integer, String> mp=new LinkedHashMap<>();
		
		if (!mp.containsValue(split)) {
			mp.put(count, split[0]);
			count++;
			mp.put(count, split[1]);
			count++;
			mp.put(count, split[2]);
			count++;
		System.out.println(mp);
		
		}}

}
