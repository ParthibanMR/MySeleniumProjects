package com.interview;

import java.util.HashMap;

public class CountWords {
	public static void main(String[] args) {
		int count=1;
		String s="How are you";
		String[] sp = s.split(" ");
		HashMap<Integer, String> hm=new HashMap<>();
		

//     for (int i = 0; i < sp.length; i++) {
//		   String sw= sp[i];
//		   System.out.println(sw);
		   if(!hm.containsValue(sp)) {
			   hm.put(count, sp[0]); 
			   count++;
			   hm.put(count, sp[1]); 
			   count++;
			   hm.put(count, sp[2]); 
			   System.out.println(hm);
//		   }
			   
	//		Object s1[]= {"hai123", 123};
		  
		
	}
	}

}
