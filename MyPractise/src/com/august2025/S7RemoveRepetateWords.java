package com.august2025;

public class S7RemoveRepetateWords {
	public static void main(String[] args) {
		String s="Java Automation";
		String result="";
		
		String newChar="";
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(newChar.indexOf(ch)==-1) {
				newChar=newChar+ch;
			}
			
		}
		result=result+newChar+" ";
		System.out.println(result);
	}
	

}
