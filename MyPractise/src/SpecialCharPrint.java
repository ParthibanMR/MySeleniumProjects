
public class SpecialCharPrint {
	private static char[] charArray;

	public static void main(String[] args) {
//		String s="new test $. is 65";
//		int specialdigit=0;
//		int whitespace=0;
//		int special=0;
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if(Character.isWhitespace(ch)) {
//			//	System.out.println(ch);
//				whitespace++;
//			}else if(Character.isLetterOrDigit(ch)) {
//				//System.out.println(ch);
//				specialdigit++;
//			}else {
//			//	System.out.println(ch);
//				special++;
//			}
//			System.out.println(whitespace);
//			System.out.println(specialdigit);
//			System.out.println(special);
//		}
		
		
		String s="She is a singer &! dancer as well12.";
		int countSpaces=0;
		int countLetterAndDigit=0;
		int special=0;
		char[] ch = s.toCharArray();
		for (char c : ch) {
		//	System.out.println(c);
			if (Character.isWhitespace(c)) {
			//	System.out.println(c);
				countSpaces++;
			} else if(Character.isLetterOrDigit(c)){
			//	System.out.println(c);
				countLetterAndDigit++;
			}else if(!Character.isWhitespace(c)||!Character.isLetterOrDigit(c)) {
				System.out.println(c);
				special++;
			}
		}
		System.out.println("spaces"+countSpaces);
		System.out.println("letter and digit"+countLetterAndDigit);
		System.out.println("special"+special);
		
	}

}
