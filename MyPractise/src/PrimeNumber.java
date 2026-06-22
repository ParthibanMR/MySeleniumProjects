import java.util.Iterator;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int a=15;
		boolean b=true;
		for (int i = 2; i < a; i++) {
			if(a%i==0) {
				b=false;
				break;
			}
		}
		if (b==true) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
	}

}
