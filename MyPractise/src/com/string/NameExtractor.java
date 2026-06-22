package com.string;

public class NameExtractor {
	public static void main(String[] args) {
		String input = "parthi))))M.rcksytems.com";

        String[] parts = input.split("[^A-Za-z]+");
        
//        for (int i = 0; i < parts.length; i++) {
//        	String s=parts[i];
//        	 System.out.println(s);
//        	 
//		}
        
        if (parts.length >= 2) {
            String firstName = capitalizeFirstLetter(parts[0]);
            String lastNameInitial = parts[1].toUpperCase().substring(0, 1);
            String fullName = firstName + " " + lastNameInitial;
            System.out.println("Output: " + fullName);
        } else {
            System.out.println("No name found in the input.");
        }
    }
	
	
	 private static String capitalizeFirstLetter(String s) {
	        if (s == null || s.isEmpty()) {
	            return s;
	        }
	        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	    }
        
       


}
