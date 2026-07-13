package com.july2026Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {
	public static void main(String[] args) {
		String input1="Race";
		String input2="Care";
		String lowerCase1 = input1.toLowerCase();
		String lowerCase2 = input2.toLowerCase();
		
//		StringBuilder sb=new StringBuilder();
//		sb.reverse(lowerCase);
		

		Collections.sort(Arrays.asList(lowerCase1));
		Collections.sort(Arrays.asList(lowerCase2));
		
		
	}

}
