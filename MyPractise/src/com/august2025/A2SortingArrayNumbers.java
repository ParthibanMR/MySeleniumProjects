package com.august2025;

import java.util.Arrays;
import java.util.Iterator;

public class A2SortingArrayNumbers {
	public static void main(String[] args) {
		int[] num= {10, 2, 3, 40, 5, 6};

		//In-build methods
//		System.out.println(Arrays.toString(num));
//		
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
		
		//without inbuild methods
		
		for (int i = 0; i < num.length; i++) {	
			for (int j = i+1; j < num.length; j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
						
				}
				
			}
		}
//		for (int k = 0; k < num.length; k++) {
//			System.out.println(num[k]);
//		}
		System.out.println(Arrays.toString(num));
		
	}

}
