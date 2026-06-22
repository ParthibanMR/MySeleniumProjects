package com.august2025;

import java.util.HashSet;

public class S11LengthOfLongestSubString {
	public static void main(String[] args) {
		String s1="abcabcbb";
		String s2="bbbbb";
		String s3="pwwkew";
		String s4="";
		
		System.out.println(lengthOfLongestSubstring(s1));
		
	}
	
	public static int lengthOfLongestSubstring(String s) {
	    HashSet<Character> set = new HashSet<>(); // stores current window chars
	    int maxLength = 0; // longest substring found so far
	    int start = 0;     // left pointer
	    int end = 0;       // right pointer

	    while (end < s.length()) {
	        char currentChar = s.charAt(end);

	        if (!set.contains(currentChar)) {
	            set.add(currentChar); 
	            maxLength = Math.max(maxLength, end - start + 1);
	            end++;
	        } else {
	            set.remove(s.charAt(start));
	            start++;
	        }
	    }
	    return maxLength;
	}


}
