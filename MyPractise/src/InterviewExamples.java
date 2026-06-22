import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterviewExamples {
	public static void main(String[] args) {
		
		/*
		 * ///ARRAY int sum=0; int a[]=new int[3]; a[0]=3; a[1]=4; a[2]=5; //normal
		 * print // System.out.println(Arrays.toString(a));
		 * 
		 * for (int i = 0; i < a.length; i++) { // System.out.println(a[i]); int s=a[i];
		 * System.out.println(s); sum+=s; //for-each for (int j : a) {
		 * System.out.println(j); }
		 * 
		 * } System.out.println(sum);
		 * 
		 * 
		 */
		
//		//List
//		List<String> l=new ArrayList<>();
//		l.add("Parthu");
//		l.add("Ini");
//		l.add("gopi");
//		System.out.println(l);
//		l.add(1, "oooo");
//		//Adding elem
//	//	System.out.println(l);
//		System.out.println("Arrays as list:"+Arrays.asList(l));
//		
////		for (int i = 0; i < l.size(); i++) {
////			System.out.println(l.get(i));
////		}
//		Collections.sort(l);
//		System.out.println("sort order: "+l);
//		for (String s : l) {
//			System.out.println(s);
//			
//		}
		
		
		Set<Integer> s=new HashSet<>();
		Set<Integer> s2=new HashSet<>();
		s.addAll(Arrays.asList(new Integer []{1,2,3,4,5,2,7}));
		s2.addAll(Arrays.asList(new Integer []{1,2,3,4,5,2,7,7,9,10}));
//		System.out.println(s);
//		System.out.println(s2);
		
//		//union
//		Set<Integer> union=new HashSet<>(s);
//		union.addAll(s2);
//		System.out.println("union"+union);
//		
//		//Intersect
//				Set<Integer> Intersect=new HashSet<>(s);
//				Intersect.retainAll(s2);
//				System.out.println("Intersect"+Intersect);
//				
				//diff
				Set<Integer> diff=new HashSet<Integer>(s);
				diff.removeAll(s2);
				System.out.println("diff"+diff);

	}
	
}
