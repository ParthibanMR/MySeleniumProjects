import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateIntegerArrays {
	public static void main(String[] args) {
		int a[] = {10, 20, 330, 330, 440};
		
//		//Set method
//		Set<Integer> set = new LinkedHashSet<>();		
//		for (int i = 0; i < a.length; i++) {
//			set.add(a[i]);
//		}
//		System.out.println("Set method: "+set);		
//	}	
		Arrays.sort(a);
		
		int j=0; //unique elemnt pointer
		
		for (int i = 1; i < a.length; i++) {
			if(a[j] != a[i] ) {
				j++;
				
				a[j]=a[i];
				System.out.println(a[i]);
			}
		}
		for (int i = 0; i <= j; i++) {
			 System.out.print(a[i] + " ");	
		}
		
	
	}
}
