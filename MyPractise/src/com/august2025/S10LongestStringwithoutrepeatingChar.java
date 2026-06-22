package com.august2025;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S10LongestStringwithoutrepeatingChar {
	public static void main(String[] args) {
		String s1="Javalegnth";
		String s2="Welcometojava";
		String s3="KollywoodRet";
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		char[] charArray3 = s3.toCharArray();
		
		List<char[]> list1=new ArrayList<>();
		list1.add(charArray1);
		System.out.println(charArray1);
		
		Set<char[]> set1=new HashSet<>();
		set1.addAll(list1);
		System.out.println(charArray1);
	}
}
