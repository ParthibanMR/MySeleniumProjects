package com.july2026Coding;

import java.util.ArrayList;
import java.util.List;

public class ZeroSplit {
	public static void main(String[] args) {
		String s="0000";
		
		//System.out.println(Integer.parseInt(s));
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			list.add(Integer.parseInt(s.split("")[i]));
		}
		System.out.println(list);
	}

}
