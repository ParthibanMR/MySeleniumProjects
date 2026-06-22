package mockpractise;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("apple");
		set.add("neww");
		
		String[] arr=new String[set.size()];
		set.toArray(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+" "+arr[i]);
		}
		
	}

}
