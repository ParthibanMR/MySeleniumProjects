package mockpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		String[] s= {"PArthu", "don", "elep"};
		
		for (String string : s) {
			System.out.println(string);
		}
		
//		List<String> l=new ArrayList<>(Arrays.asList(s));
//		System.out.println(s);
		
		List<String> l1=new ArrayList<>();
		Collections.addAll(l1, s);
		System.out.println(l1);
		
		
		
	
	}

}
