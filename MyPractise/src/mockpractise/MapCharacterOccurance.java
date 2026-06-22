package mockpractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapCharacterOccurance {
	public static void main(String[] args) {
		
		String s="Hi buddy how are you";
		
		Map<Character, Integer> mp=new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			       char ch=s.charAt(i);
			if(!mp.containsKey(ch)) {
				mp.put(ch, 1);
			}else{
				Integer integer = mp.get(ch);
				mp.put(ch, integer+1);
			}
		}
		System.out.println(mp);
	}

}
