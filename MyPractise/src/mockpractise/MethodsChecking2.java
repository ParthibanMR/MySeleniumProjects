package mockpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsChecking2 {
	public static void main(String[] args) {
		/*
		 * String s="parthu";
		 * 
		 * for (int i = 0; i < s.length(); i++) { 
		 * char charAt = s.charAt(i);
		 * System.out.println(charAt);
		 * 
		 * }
		 */
	
	/*	String s="parthu varma";
		
		char[] ch = s.toCharArray();
		System.out.println(ch);

		for (char c : ch) {
			System.out.println(c);} */
		
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		
		
		if(Arrays.equals(a, b)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		
	}
	
}
