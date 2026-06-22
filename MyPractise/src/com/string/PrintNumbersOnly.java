package com.string;

public class PrintNumbersOnly {
	public static void main(String[] args) {
		String s="Welcome@#aspire123";
		int count=0;
		int alphacount=0;
		int splcount=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9') {
				System.out.println(ch);
				count++;
			}
			else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				System.out.println(ch);
				alphacount++;
			}
			else {
				System.out.println(ch);
				splcount++;
			}
			
		}
		System.out.println("total number count:"+count);
		System.out.println("total Alpha count:"+alphacount);
		System.out.println("total spl count:"+splcount);
	}

}
