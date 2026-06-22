package com.august2025;

public class S13String {

    public static void main(String[] args) {
        String s = "A2B3C";
        StringBuilder result = new StringBuilder();

        int pendingCount = 1;    // default count if no number before a letter
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Build the full number (handles multi-digit counts like "12")
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                pendingCount = num; // this applies to the NEXT letter
            } else if (Character.isLetter(ch)) {
                // Use the pending count for this letter
                for (int k = 0; k < pendingCount; k++) {
                    result.append(ch);
                }
                pendingCount = 1; // reset to default for subsequent letters
                i++;
            } else {
                // Skip any other characters if present
                i++;
            }
        }

        System.out.println(result.toString()); // Output: ABBCCC
    }



}
//this is my approach simple and super
//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        String s="A2B3C4D";
//        
//        int defaultCount=1;
//        StringBuilder result = new StringBuilder();
//        
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            
//            
//            if(Character.isDigit(ch)){
//               defaultCount=ch - '0'; 
//            }else if(Character.isLetter(ch)) {
//                for(int j=0; j<defaultCount; j++){
//                   result.append(ch);
//                }
//                defaultCount=1;
//            }
//        }
//       System.out.println(result.toString());
//    }
//     
//}
