import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str="APPLE";
		List<Character> l=new ArrayList<>();
		String word="";
		String duplicate="";
//		char[] ch = s.toCharArray();

//        for (char s : str.toCharArray()) {
//			String ch = Character.toString(s);
//		//	System.out.println(ch);
//			if (!l.contains(ch)) {
//				l.add(ch);
//				word=word.concat(ch);
//			} else {
//				duplicate=duplicate.concat(ch);
//			}
//		}
//		System.out.println("word: "+word);
//		System.out.println("duplicte: "+duplicate);
		String dupli="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		//	System.out.println(ch);
			if(!l.contains(ch)) {
				l.add(ch);
				
			}else {
				dupli=dupli+ch;
		//		dupli=dupli.concat(ch);
				
			}
				
			
		}
		System.out.println(dupli);
		System.out.println(l.stream().map(c->Character.toString(c)).collect(Collectors.joining()));
	}
	
}
