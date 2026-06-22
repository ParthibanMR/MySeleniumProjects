package mockpractise;

public class StringToStringArray {
	public static void main(String[] args) {
		String str = "Converting string to string array using split() method";  
		//declaring an empty string array  
		String[] strArray = null;  
		//converting using String.split() method with whitespace as a delimiter  
		strArray = str.split(" ");  
		//printing the converted string array  
		for (int i = 0; i< strArray.length; i++){  
		System.out.println(strArray[i]);  
		}  
		}  

}
