package com.july2026Coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstAndSecondNonrepeaatedCharacter {
	public static void main(String[] args) {
		
		//Method.1 
//		String s="abbacded";
//		char[] charArray = s.toCharArray();
//		int count=0;
//		
//		for (char c : charArray) {
//			if (s.indexOf(c)==s.lastIndexOf(c)) {
//				count++;
//				
//				if(count==2) {
//				
//				System.out.println(c);
//				}
//				
//			}
//		}
		
		//2. Method 2
		int count=0;
		String input="Parthiban";
		Map<Character, Integer> mp=new HashMap<>();
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if(!mp.containsKey(ch)) {
				mp.put(ch, 1);
			}else
			{
				Integer integer = mp.get(ch);
				mp.put(ch, integer+1);
			}
			
		}
		System.out.println(mp);
		for (Entry<Character, Integer> entry: mp.entrySet()) {
			if(entry.getValue()==1) {
				//System.out.println(entry.getKey());
				count++;
				
				if(count==2) {
					System.out.println(entry.getKey());
					break;
				}
				
		}
			
		}	
		
	}

}
