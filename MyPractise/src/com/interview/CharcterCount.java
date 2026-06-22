package com.interview;

class CharcterCount {
	public static void main(String[] args) {
		
		String s="qwer56####";
		 char ch = 0;
		
		int alphaCount = 0;
		int letterCount = 0, splCount=0;
		
		for (int i = 0; i < s.length(); i++) {
			  ch= s.charAt(i);
			//  System.out.println(ch);
			  if(Character.isAlphabetic(ch)) { 
				alphaCount++; 
				System.out.println("what if: "+ch);
			  } 
			  else if(Character.isDigit(ch)) {
					 letterCount++;
					 System.out.println("what if: "+ch);
		} 
		else {
			     splCount++;
			     System.out.println("what if: "+ch);
				  
		}
			  
	}
		System.out.println(alphaCount);
		 System.out.println(letterCount);
		System.out.println(splCount);
	
	}
}
