package mockpractise;

import java.util.ArrayList;
import java.util.List;

public class String2DuplicateCharactersFromString {
	public static void main(String[] args) {
		
//		int count = 0;
//		String s="new java class";
//		
//		List<Character> l=new ArrayList<>();
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch=s.charAt(i);
//			 for (int j = 0; j < s.length(); j++) {
//	                if (s.charAt(j) != ch) {
//	                    continue;
//	                }
//	                count++;
//	 
//	            }
//				
//	if (!l.contains(ch)) {
//        // check if count is more than 1 i.e. duplicate and char should not be space
//        if (count > 1 && ch != ' ') {
//
//            System.out.println("Char: " + ch + ", Count: " + count + " times.");
//            l.add(ch);
//        }
//    }
//
//    // set counter to zero for next ch
//    count = 0;
//}
		
		String s="hi bussy how are you whats app";
		Character chara = null;
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			List<Character> li=new ArrayList<>();
			
			if (!li.contains(ch)) {
				li.add(ch);
				count++;
//			}else {
//				chara = li.get(ch);
//				li.add((char) (chara));		
//			}	
			System.out.println(li);

			}}
		
	}	
}
