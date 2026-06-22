
public class ArmStrongNumber {
	public static void main(String[] args) {
		/* 1. logic given number count (ex: 153=3 and 1123=4) 
		 * 2. number ^ count (ex: (1*1*1))*/
		
		int a=1523;
		
		int temp=a;
		int sum=0;
		int count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		a=temp;
		while(a>0) {
		int lastnum=a%10;
	    sum = (int) (sum+Math.pow(lastnum, count));
	a=a/10;
		}
		if (sum==temp) {
			System.out.println("armstring");
		} else {
			System.out.println("not armstring");
		}
	
	}
}
