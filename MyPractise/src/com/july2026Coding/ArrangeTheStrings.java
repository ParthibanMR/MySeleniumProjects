package com.july2026Coding;

public class ArrangeTheStrings {
	public static void main(String[] args) {
		String s1="My Parthiban";
		String s2="name is";
		
		String[] split = s1.split(" ");
		String full=split[0]+" "+s2+" "+split[1];
		System.out.println(full);
	}

}
