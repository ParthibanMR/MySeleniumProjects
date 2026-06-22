package com.august2025;

public class N1FibonacciSeries { //logic 0 1 1 2 3 5 8 13 21 34 -> no of terms 10
	public static void main(String[] args) {
		
		int numberOfTerms=10;
		
		int first=0;
		int Second=1;
		
		for (int i = 1; i <= numberOfTerms; i++) {
			
			System.out.print(first + " ");
			int nextNumbers = first + Second;
			
			first=Second;
			Second = nextNumbers;
			
			
			
		}
		
	}

}
