import java.util.Iterator;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		int a[]= {50,30,40,70};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}
