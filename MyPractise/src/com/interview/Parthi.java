package com.interview;

public class Parthi {
	public static void main(String[] args) {
		String s1 = null;
		String s="parthi)356$%. M00.aspiresystems.com";
		
		String[] split = s.split("\\.");
		
		for (int i = 0; i < split.length; i++) {
			s1=split[0];
//			System.out.println(s1);
//			String[] split2 = s1.split("//d");
//			System.out.println(split2);
		}
		String[] split2 = s1.split("\\b");
		
//		for (String string : split2) {
//			System.out.println(string.charAt());
//			
//		}
		
	    
	}
//	public static void main(String[] args) {
//		String s="parthi 355555M";
//		
//		String[] split = s.split(" ");
//		for (String string : split) {
//			System.out.println(string);
//		}
//	}

}
