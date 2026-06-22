package com.august2025;

public class A4MissingNumberInArray {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,5,6,7};
		
		int n=a.length+1; //since one number is missing so we added +1
		int arraySum=0;
		int totalnum=n*(n+1)/2;
		System.out.println(totalnum); //so here answer is 28
		
		for (int arrayNum : a) {
			arraySum=arraySum+arrayNum;
		}
		System.out.println(arraySum);
		
		int missingNum=totalnum-arraySum;
		
		System.out.println("Missing number is: "  + missingNum);
		
	}

}
