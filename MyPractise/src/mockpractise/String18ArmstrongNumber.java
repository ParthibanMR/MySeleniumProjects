package mockpractise;

public class String18ArmstrongNumber {
	public static void main(String[] args) {
	
		int num=143;
		int count = 0;
		int temp=num;
		
		int powNum=0;
		
		//concept 3 numbers so 1 cube+5cube+3Cube
		
		while(num>0) {
			num=num/10;
			count++;
		}
		
		num=temp;
		
		while(num>0) {
			int rem=num%10;
			
			powNum = (int) (powNum+Math.pow(rem, count));
			
			num=num/10;
		}	
		if(powNum==temp) {
			System.out.println("Armstrong number");
		}else {
		System.out.println("Not Armstrong number");
		}
		}

	

}
