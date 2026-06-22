package com.august2025;

public class S5Removespaces {
	public static void main(String[] args) {
		String s="Hello java program";
		String result="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch !=' ') {
			result=result+ch;	
			}
		}
		System.out.println(result);
	}

}
