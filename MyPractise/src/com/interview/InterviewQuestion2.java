package com.interview;

public class InterviewQuestion2 {
	public static void main(String[] args) {

		//1. first o/p - CBA1234oiu
	String input = "ABC1234uio";
	String starting = input.substring(0, 3);
	String intermediate = input.substring(3, 7);
	String ending = input.substring(7);
	
	// Reverse the letter parts
	String staringReverse=new StringBuilder(starting).reverse().toString();
	String endingReverse=new StringBuilder(ending).reverse().toString();
	
	 // Combine to form the final output
	String result=staringReverse+intermediate+endingReverse;
	System.out.println(result);
	
	
	//Secondd - o/p - oiu123CBA
	String secondResult=endingReverse+intermediate+staringReverse;
	System.out.println(secondResult);
	
	
}

}
