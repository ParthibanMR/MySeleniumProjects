package com.august2025;

public class S2WordCount {
	public static void main(String[] args) {
     String s = "Java is a not a Java Program";
		
		String[] split = s.split(" ");
		
//		int length = split.length;
//		System.out.println(length);
		
		int count=0;
		
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			count++;
			
		}
		System.out.println("Total count: "+count);
	}

}
