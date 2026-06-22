package mockpractise;

public class String6Palindrome {
	public static void main(String[] args) {
		String string1="madam";
		

			String reversedString=reverseString(string1);
	
		
	if (string1.equals(reversedString)) {
		 System.out.println("The inputString '" + string1 + "' is a palindrome String.");
    } else {
        System.out.println("The inputString '" + string1 + "' is not a palindrome String.");
    }
	}
	public static String reverseString(String string1) {
		
		String reversedString = null;
		for (int i = string1.length()-1; i >=0; i--) {
			char charAt = string1.charAt(i);
			System.out.println(charAt);
			
			reversedString=reversedString+charAt;
		}
		return reversedString;

	}

}
