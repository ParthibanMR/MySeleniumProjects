
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234; 
		int rev=0;
	//	System.out.println(a);
		while(a>0) {
			int rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		System.out.println(rev);

	}

}
