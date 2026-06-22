package mockpractise;

public class IntegerToArray {
	public static void main(String[] args) {
		int number=1234555;
		
	//	System.out.println(String.valueOf(number));
//		char[] charArray = String.valueOf(number).toCharArray();
//		System.out.println(charArray);
		
		String[] digits = String.valueOf(number).split("");
		System.out.println(digits);
	}

}
