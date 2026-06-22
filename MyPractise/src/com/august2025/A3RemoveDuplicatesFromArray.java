package com.august2025;

import java.util.HashSet;
import java.util.*;

public class A3RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int a[] = {5,2,9,1,6,2,5};
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			set.add(num);
		}
	//	System.out.println(set);
		
		int[] result = new int [set.size()];
		int i=0;
		for (int arrayNum : set) {
			result[i++]=arrayNum;
		}
	//	System.out.println(Arrays.toString(result));
		for (int lastresult : result) {
			System.out.print(lastresult);
		}
		
		
	}

}
