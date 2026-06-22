package com.workinglogic.com;

import java.util.Arrays;

public class StringBasedProgrms {
	public static void main(String[] args) {
//		String s[]= {"123", "234", "436"};
//		int n[]=new int[s.length];
//		
//		for (int i = 0; i < s.length; i++) {
////			String string = s[i];
////			System.out.println(string);
//			n[i] = Integer.parseInt(s[i]);
//			
//		}
//		System.out.println(Arrays.toString(n));
		
		
		//2.
//		int n[]= {1,2,3,3};
//		
//		String s[]=new String[n.length];
//		
//		for (int i = 0; i < n.length; i++) {
//			String valueOf = String.valueOf(n[i]);
////			System.out.println(valueOf);
//			s[i]=String.valueOf(n[i]);
//		}
//		System.out.println(Arrays.toString(s));
		
		//3.
//		int n[]= {1,2,3,3,4,5,4};
//		String string = Arrays.toString(n);
//		System.out.println(string);
		
		//4. reverse the string
//		String s="welcome to java";
//		
//		String rev="";
//		
//		for (int i = s.length()-1; i >=0; i--) {
//			char ch = s.charAt(i);
//			rev=rev+ch;
//		}
//		System.out.println(rev);
		
		//5. reverse the string each word
		String s="welcome to java";
		String[] split=s.split(" ");
		String overAllRev="";
		
		for (int i = 0; i < split.length; i++) {
			String word=split[i];
			
			String rev="";
			
			for (int j = word.length()-1; j >=0; j--) {
				char ch = word.charAt(j);
				rev=rev+ch;
				
			}
			System.out.println(rev);
			overAllRev=overAllRev+rev;
		}
		System.out.println(overAllRev.trim());
		
	}

}
