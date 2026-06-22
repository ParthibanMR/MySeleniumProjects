package com.string;

public class CharacterRreverseOnly {
	public static void main(String[] args) {
		String s="ABC123er";
		char[] charArray = s.toCharArray();
		
		StringBuilder lettersOnly=new StringBuilder();
		
		for (char c : charArray) {
			if(Character.isLetter(c)) {
				lettersOnly.append(c);
			}
			
		}
		//lettersOnly.reverse()
		System.out.println("Reverse order: "+lettersOnly.reverse());
		
		//Rebuild the final string
		StringBuilder result=new StringBuilder();
		int letterIndex=0;
		
		for (char c : charArray) {
			if(Character.isLetter(c)) {
			//	System.out.println(result.append(lettersOnly.charAt(letterIndex)));
				result.append(lettersOnly.charAt(letterIndex++));
				letterIndex++;
			//	System.out.println(letterIndex++);
			}else {
				result.append(c); //keep non letter character (digits) unchanged
			}
		}
		System.out.println("Output: "+result.toString());
	}

}
