package com.march2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deloiite {
	public static void main(String[] args) {
		String s="aabbcaaab"; //o/p - a5b3c1
		int count=0; 
		
		Map<Character, Integer> mp=new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(!mp.containsKey(ch)) {
				mp.put(ch, 1);
			}else {
				Integer integer = mp.get(ch);
				mp.put(ch, integer+1);
			}
			
		}
		//System.out.println(mp);
		StringBuilder sb=new StringBuilder();
		for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
			sb.append(entry.getKey()).append(entry.getValue());
			//sb.append(entry.getValue());
		}
		System.out.println(sb.toString());
	}

}
