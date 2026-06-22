package com.august2025;

import java.util.Arrays;

public class A5MinAndMaxNumber {
	public static void main(String[] args) {
		int[] a= {3,4,5,30,75,32,1,0};

		//thi is my way to find smallest and largest
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				
//				if(a[i]>a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		
//		System.out.println("Smallest Numberis : "+ a[0]);
//		System.out.println("Largest Number is: "+ a[a.length-1]);
		

		//Second way to approch
		if(a==null || a.length==0) {
			System.out.println("Array must not be empty or null");
		}
			int max=a[0]; //initilaize the max value
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]>max) {
					max=a[i]; //here the max will updated
				}
			}
			System.out.println(max); //same way we can write min valu as well
		}
		
	

}
