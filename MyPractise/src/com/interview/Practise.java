package com.interview;

import java.util.*;

public class Practise {
	public static void main(String[] args) {
		
	//	List<Integer> l=new ArrayList<>(); 
		int a[]= {100,20, 20,300,40,40,6,6};
		Set<Integer> set = new HashSet<>();
		
		for(int num : a) {
			set.add(num);
		}
		System.out.println(set);
		
		
		int uniqueArray[] = new int [set.size()];
		int index=0;
		
		for(int num : set) {
			uniqueArray[index++]=num;
		}
		Arrays.sort(uniqueArray);
		 System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
		
//		Arrays.sort(a);
//		
//		int j=0;
//	  for (int i = 0; i < a.length; i++) {
//		  if(a[i]!=a[j]) {
//			  j++;
//			  a[j]=a[i];
//			  System.out.println(a[i]);
//		  }
//
//	}
		
		
		
	  

	}

}
