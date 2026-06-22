package mockpractise;

import java.util.ArrayList;
import java.util.List;

public class String12CountTheOccurancesInMyMethod {

	    public static void main(String[] args) {
	        String inputString = "Welcome to Java";

	        List<Character> li = new ArrayList<>();
	        List<Integer> counts = new ArrayList<>();

	        for (int i = 0; i < inputString.length(); i++) {
	            char charAt = inputString.charAt(i);

	            if (!li.contains(charAt)) {
	                li.add(charAt);
	                counts.add(1);
	            } else {
	                int index = li.indexOf(charAt);
	                int count = counts.get(index);
	                counts.set(index, count + 1);
	            }
	        }

	        for (int i = 0; i < li.size(); i++) {
	            System.out.println("Character: " + li.get(i) + ", Occurrences: " + counts.get(i));
	        }
	    }
	





}
