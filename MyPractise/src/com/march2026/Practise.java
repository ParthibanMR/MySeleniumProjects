package com.march2026;

public class Practise {
	public static void main(String[] args) {
		String s="aabbbcccccdefgh";
		String result="";
		
		for (char c : s.toCharArray()) {
			if(!result.contains(String.valueOf(c))) {
				result=result+c;
			}
		}
		System.out.println(result);
	}

}
