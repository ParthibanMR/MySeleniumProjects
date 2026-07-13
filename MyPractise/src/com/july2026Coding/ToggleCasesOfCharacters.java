package com.july2026Coding;

public class ToggleCasesOfCharacters {
	public static void main(String[] args) {
		String input="my name is parthiban";
		String[] word = input.split("");
		String output="";
		
		for (String string : word) {
			String[] sp = string.split("");
			
			for (int i = 0; i < sp.length; i++) {
				if(i==1) {
					output+=sp[i].toUpperCase();
				}else {
					output+=sp[i];
				}
					
			}
			output="";
			System.out.println(output);
		}
	}

}
