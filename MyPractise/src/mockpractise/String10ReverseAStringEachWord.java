package mockpractise;

public class String10ReverseAStringEachWord {
	
	public static void main(String[] args) {
		

	String s="hi buddy I am checking new things";
	
	String rev="";
	
	String [] sp=s.split(" ");
	
	for (int i = 0; i < sp.length; i++) {
		String str=sp[i];
	//	System.out.println(str);
		
		String s1=" ";
		
		for (int j = str.length()-1; j >=0 ; j--) {
			char ch= str.charAt(j);
//			System.out.print(ch);
			s1=s1+ch;
	//		System.out.print(ch);
		}
		rev=rev+s1+"";
//	    System.out.println(rev);
		
	}
	rev=rev.trim();
	System.out.println(rev);

	}
}
