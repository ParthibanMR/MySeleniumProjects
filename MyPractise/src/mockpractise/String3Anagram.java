package mockpractise;

import java.util.Arrays;

public class String3Anagram {
	public static void main(String[] args) {
		String str1="mary";
		String str2="Army";
		
		System.out.println(isAnagram(str1, str2));
	}
	public static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		
		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
		
	}
	
}
