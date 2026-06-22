package com.august2025;

public class A6GivenNumberAvialbleinArray {
	public static void main(String[] args) {

	int a[]= {13,2,4,5, 590, 345};
	boolean flag=false;
	
	int targetNum=5;
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]==targetNum) {
			flag=true;
			break;
		}
	}
	if (flag) {
	System.out.println("Target number is availble");
	}else {
		System.out.println("Target is not available");
	}
	
	
	
			
	
}
}
