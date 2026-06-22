package com.august2025;

public class A7AddIntegersinObjectArray {
	public static void main(String[] args) {
	
		String[] a= {"1", "St", "3", "4", "24", "36", "@#"};
		int sum = 0;
		
		for(String elem : a) {
			try {
			int num=Integer.parseInt(elem);
			sum=sum+num;
			
		}catch(Exception e) {
			//System.out.println("Number format execption");
		}
		
	}
		System.out.println(sum);
	}

}
