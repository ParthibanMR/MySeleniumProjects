import java.util.Iterator;

public class ReversesString {
	public static void main(String[] args) {
		String s="welcome to java";
		String rev="";
		for (int i = s.length()-1; i >=0 ; i--) {
			char c=s.charAt(i);
			rev=rev+c;
			
		}
		System.out.println(rev);
	}

}
