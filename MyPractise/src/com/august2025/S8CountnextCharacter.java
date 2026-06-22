package com.august2025;

public class S8CountnextCharacter {
	public static void main(String[] args) {
		String s="aabbccddeefff";
		String output="";
		
		int count=1;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(i<s.length()-1 && ch==s.charAt(i+1)) {
				count++;
			}else {
				output=output+ch+count;
				count=1;
			}
			
		}
		System.out.println(output);
	}

}
