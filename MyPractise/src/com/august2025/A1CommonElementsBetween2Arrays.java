package com.august2025;

import java.util.*;

public class A1CommonElementsBetween2Arrays {
	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<>();
		Set<Integer> commonSet=new HashSet<>();
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {2,3,5,7,8};
		
//		for (int num : a1) {
//			s1.add(num);
//		}
//		
//		for (int num2 : a2) {
//			if (s1.contains(num2)) {
//				commonSet.add(num2);
//			}
//			
//		}
//	//	System.out.println(s1);
//		System.out.println(commonSet);
		
		

		
		for (int i = 0; i < a1.length; i++) {
			int num1=a1[i];
			s1.add(num1);
		}
		
		for (int j = 0; j < a2.length; j++) {
			int num2=a2[j];
			if(s1.contains(num2)) {
				commonSet.add(num2);
			}
			}
		System.out.println("Common elements: " +commonSet);
			

		}


}
