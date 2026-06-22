package com.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ppprrrrr {
	public static void main(String[] args) {
		
	/*	Map<Integer, String> mp=new HashMap<>();
		mp.put(1, "lo");
		mp.put(2, "yes");
		
		Collection<String> values = mp.values();
		System.out.println(values);
		
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		for (Entry<Integer, String> all:mp.entrySet()) {
			System.out.println(all.getKey() +":"+all.getValue());
			
		} */
		
		
		String s="Hello";
		char[] charArray = s.toCharArray();
		//direct print
		//System.out.println(charArray);
		
		//loop print
//		for (char c : charArray) {
//			System.out.println(c);
//		}
		
		//inside array print
		System.out.println(Arrays.toString(charArray));
		
		//char array to string
	    System.out.println(String.valueOf(charArray));
	}

}
