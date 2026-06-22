package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTesting {
	public static void main(String[] args) {
		Map<String, String> mp=new HashMap<>();
		
		mp.put("1", "parthi");
		
		for (Entry<String, String> s : mp.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

}
