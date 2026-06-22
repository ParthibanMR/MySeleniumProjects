package com.august2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A8PrintnotrepeatedNumbers {
	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,4,5,5,6,6};
		int arryNum = 0;
		
		Map<Integer, Integer> mp=new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			arryNum=a[i];
			
			if(!mp.containsKey(arryNum)) {
				mp.put(arryNum, 1);
			}else{
				Integer integer = mp.get(arryNum);
				mp.put(arryNum, integer+1);
				
			}
			
		}
		//System.out.println(mp);
     for (Entry<Integer, Integer> entry : mp.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
		}
	}		
		
	}

}
