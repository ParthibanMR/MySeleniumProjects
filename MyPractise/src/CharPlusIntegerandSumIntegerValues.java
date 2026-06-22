
public class CharPlusIntegerandSumIntegerValues {
	public static void main(String[] args) {

	String s="Ptyru123478";
	int value = 0;
	String chars ="";
	
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		
		if(Character.isDigit(ch)) {
			value=value+Character.getNumericValue(ch);
		} else {
			chars = chars+ch;
		}
	}
		System.out.println(value);
		System.out.println("Characters: " + chars);
	}
	

}
