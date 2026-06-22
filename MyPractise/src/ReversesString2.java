

public class ReversesString2 {
	public static void main(String[] args) {
		String s="welcome to java class";
		String fullRev="";
		
		String[] split = s.split("");
		for (int i = split.length-1; i >=0; i--) {
			String str = split[i];
		//	System.out.println(str);
			
			String rev="";
			for (int j = str.length()-1; j >=0; j--) {
				char ch = str.charAt(j);
				rev=rev+ch;
				
			}
			System.out.println("rev order:"+rev);
			fullRev=fullRev+rev;
		}
		fullRev=fullRev.trim();
		System.out.println(fullRev);
		
		}
}
