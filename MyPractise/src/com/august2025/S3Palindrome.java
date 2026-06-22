package com.august2025;

public class S3Palindrome {
	public static void main(String[] args) {
		String s="madam";
		
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
			char ch = s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
		if(s.equals(rev)){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		
	}

}
