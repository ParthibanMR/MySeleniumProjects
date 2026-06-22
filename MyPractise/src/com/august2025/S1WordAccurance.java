package com.august2025;

import java.util.HashMap;
import java.util.Map;

public class S1WordAccurance {
	public static void main(String[] args) {
		String s = "Java is a not a Java Program";
		
		String[] split = s.split(" ");
		
		Map<String, Integer> mp=new HashMap<>();
		
		for (int i = 0; i < split.length; i++) {
			String splitString=split[i];
			if(!mp.containsKey(splitString)) {
				mp.put(splitString, 1);
			}else {
				Integer integer = mp.get(splitString);
				mp.put(splitString, integer+1);
			}
		}
		System.out.println(mp);
	}

}
