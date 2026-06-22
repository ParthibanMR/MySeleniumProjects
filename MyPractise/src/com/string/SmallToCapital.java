package com.string;

public class SmallToCapital {
	public static void main(String[] args) {
		
		String s="WelcomeParthi";
		String upper="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			
			if (ch>='a' && ch<='z') {
				char upp=Character.toUpperCase(ch);
				upper=upper+upp;
			}else {
				upper=upper+ch;
			}
			
		}
		System.out.println(upper);
	}

}
