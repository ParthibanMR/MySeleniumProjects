import java.util.Arrays;
import java.util.List;

public class NormalForLoop {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		for (int i : numbers) {
			System.out.println(i);
		}
		//Arrays convert to the list
		List<Integer> l=Arrays.asList(5,6,7,8,9);
		for (int arry : l) {
			System.out.println("List:"+arry);
		}
	}

}
