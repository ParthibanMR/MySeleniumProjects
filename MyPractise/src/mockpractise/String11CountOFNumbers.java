package mockpractise;

public class String11CountOFNumbers {
	
	public static void main(String[] args) {
		String str="welcome.#@1235parthi";
		
		int numCount=0;
		int AlphaCount=0;
		int Splcount=0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>='0' && ch<='9') {
				numCount++;
			}else if (ch>='A' && ch<= 'Z' || ch>='a' && ch<= 'z') {
				AlphaCount++;
			}else {
				Splcount++;
			}
				
		}
		System.out.println("Number count: "+numCount);
		System.out.println("Alpha count: "+AlphaCount);
		System.out.println("Spl count: "+Splcount);
	}

}
