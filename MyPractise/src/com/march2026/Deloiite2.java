package com.march2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deloiite2 {
	public static void main(String[] args) {
		String s="a5b3c1"; //o/p - aabbcaaab
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < s.length(); i=i+2) {
			char ch = s.charAt(i); //character
			int count = s.charAt(i+1)-'0'; //character to integer conversion
			
			for (int j = 0; j < count; j++) { //0<5, 0<3, 0<1
				result.append(ch);
			}
		}
		System.out.println(result.toString());
	}

}
