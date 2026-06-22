package com.naveenautomation;

public class RemoveJunckChara {
	public static void main(String[] args) {
		String s="##&&1234Java";
		
		//RegExpressions
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}

