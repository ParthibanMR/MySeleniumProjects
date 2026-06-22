
public class PrintNumberOnly {
public static void main(String[] args) {
	String s="Welcome@123";
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		
		if (ch>='0' && ch<='9') {
			System.out.println(ch);
		}
	}
}
}
