import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Split {
	public static void main(String[] args) {
//		String s = "a52df6g7h8j"; // 1, 2, 3
//		String[] split = s.split("\\D"); // \d - number \D - alb
//		for (String string : split) {
//			System.out.print(string);
//		}
//		String s="trt123";
//		String num="";
//		String alpha="";
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//		//	System.out.println(ch);
//			if(Character.isDigit(ch)) {
//				num=num+ch;
//				System.out.println(num);
//			}else if(Character.isAlphabetic(ch)){
//				alpha=alpha+ch;
//				System.out.println("alpha: "+alpha);
//			}
//			
//		}
		String s="Javatpoint12345";
		String output = s.replaceAll("[^A-Za-z]","");
//		int numOutput = Integer.parseInt(s.replaceAll("[^0-9]", ""));
		String numOutput=s.replaceAll("[^0-9]", "");
		System.out.println(output);
		System.out.println(numOutput);
		
	}

}
