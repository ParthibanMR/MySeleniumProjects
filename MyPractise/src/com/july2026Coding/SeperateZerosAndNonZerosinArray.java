package com.july2026Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SeperateZerosAndNonZerosinArray {
	public static void main(String[] args) {

	int input[] = {12, 9, 0, 10, 0, 23, 25, 0};
	
	//Out put {12, 9, 10, 23, 25, 0, 0, 0}
	
	List<Integer> list=new ArrayList<>();
	
	String Zero="";
	
	for (int val : input) {
		
		if(val==0) {
			Zero=Zero+String.valueOf(val);
		}else {
			list.add(val);
		}
	}
	
	for (int i = 0; i < Zero.length(); i++) {
		list.add(Integer.parseInt(Zero.split("")[i]));
	}
	
	System.out.println(list);
	//Object[] array = list.toArray();  ---list to Array
	System.out.println(Arrays.toString(list.toArray())); //list to Array
	
}
}
