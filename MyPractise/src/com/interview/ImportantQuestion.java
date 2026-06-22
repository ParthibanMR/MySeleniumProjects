package com.interview;

public class ImportantQuestion {
	    public static void main(String[] args) {
	        String s = "Java is a programming language";
	    	
//	    	String s = "ABCD123uio";
//	        String[] sp = s.split("123");
	        String[] sp = s.split(" ");
	        String rev = " ";

	        for (int i = 0; i < sp.length; i++) {
	            String word = sp[i];

	            // If the word is too short to be reversed, just keep it as it is
	            if (word.length() <= 2) {
	                rev += word + " ";
	            } else {
	                // Keep the first and last characters, reverse the middle part
	                char first = word.charAt(0);
	                char last = word.charAt(word.length() - 1);
	                
	                String middle = word.substring(1, word.length() - 1); // Middle part
	                String reversedMiddle = "";

	                for (int j = middle.length() - 1; j >= 0; j--) {
	                    reversedMiddle += middle.charAt(j);
	                }

	                // Combine the first, reversed middle, and last characters
	                rev += first + reversedMiddle + last + " ";
	            }
	        }

	        // Print the final result
	        System.out.println(rev.trim());
	    } 
	
	
	
	
	
	
	
	
	
	/*  public static void main(String[] args) {
	        String s = "ABCD12356uio";  // Input string
	        
	        // Step 1: Collect alphabetic characters
	        StringBuilder letters = new StringBuilder();
	        for (char ch : s.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                letters.append(ch);  // Collect all letters
	            }
	        }
	        
	        // Step 2: Reverse the collected letters
	        letters.reverse();
	        
	        // Step 3: Rebuild the final string with reversed letters and numbers in place
	        StringBuilder result = new StringBuilder();
	        int letterIndex = 0;  // Track position in reversed letters
	        
	        for (int i = 0; i < letters.length(); i++) {
	            char ch = letters.charAt(i);
	         //   System.out.println("Index: " + i + ", Character: " + ch);
	        }

	        for (char ch : s.toCharArray()) {
	            if (Character.isLetter(ch)) { //ABCD12356uio
	                result.append(letters.charAt(letterIndex++));  // Add reversed letters in place of original letters
	            } else {
	                result.append(ch);  // Keep digits and non-letters as is
	            }
	        }
	        
	        // Output the final result
	        System.out.println(result.toString());  // Expected Output: oiu12356DCBA */
	    }
	

