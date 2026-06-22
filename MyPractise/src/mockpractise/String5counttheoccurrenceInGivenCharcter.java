package mockpractise;

import java.util.ArrayList;
import java.util.List;

public class String5counttheoccurrenceInGivenCharcter {
	public static void main(String[] args) {
		String inputString="Welcome to Java";
		
		int count = 0;
		char charAt;
		
	//	char c='o';
		
		List<Character> li=new ArrayList<>();
		
		for (int i = 0; i < inputString.length(); i++) {
			charAt = inputString.charAt(i);
			
	
			if (inputString.charAt(i)=='J') {	
				count++;
			}
			
		}
		System.out.println("occurences: "+count++);
		
	}

}
