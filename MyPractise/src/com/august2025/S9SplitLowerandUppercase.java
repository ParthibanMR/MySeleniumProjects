package com.august2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S9SplitLowerandUppercase {
	public static void main(String[] args) {
		String s="aBACbcEDed";
		
		String lowerCase="";
		String UpperCase="";
		
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowerCase=lowerCase+ch;
			}else {
				UpperCase=UpperCase+ch;
			}
		}
		
		//Noraml order print
		System.out.println(lowerCase);
		System.out.println(UpperCase);
		
		//Sorted order print
		char[] lowerArray = lowerCase.toCharArray();
		char[] upperArray = UpperCase.toCharArray();
		Arrays.sort(lowerArray);
		Arrays.sort(upperArray);
		
		System.out.println(lowerArray);
		System.out.println(upperArray);
		
		
		
		//Collections Sort order 
	    List<Character> lowerList=new ArrayList<>();
	    List<Character> upperList=new ArrayList<>();
	    
	    for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowerList.add(ch);
			}else {
				upperList.add(ch);
			}
		}
	    Collections.sort(lowerList);
	    Collections.sort(upperList);
	    
	    System.out.println("List lower"+lowerList);
		System.out.println("List upper"+upperList);
	}
	
	
}
