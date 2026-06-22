package com.august2025;

import java.util.Arrays;

public class S4Anagrams {
	public static void main(String[] args) {
		
	
	String s1="Race";
	String s2="Care";
	
	if(s1.length()==s2.length()) {
		
		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean equals = Arrays.equals(charArray1, charArray1);
		
		if(equals==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("No anagram");
		}
	}

	}
}
