package com.workinglogic.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int a[]= {10,20,30,50,20,60,50,30};
		int temp;
	    int count=0;
//		List<Integer> l=new ArrayList<>(a.length);
//
//		List<Integer> withOutDuplicates=new ArrayList<>(a.length);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				a[j]=a[a.length-1];
//				temp = a[i];
//				System.out.println(temp);
				}
			}
		}
			System.out.println(Arrays.toString(a));
	
		
	}
	

}
