package com.march2026;


public class EPAMTrycatchFinally {
	public static void main(String[] args) {
		int x=2;
		try {
			
			//int x=2;
			System.out.println(x++); // firt use the value (2) then increase (internally 3)
		}finally {
			System.out.println(++x); // First increae the value (3-> 4) then print
		
		//catch (IndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
		}
		
	}

}
