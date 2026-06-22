package mockpractise;

public class String8CountTheNumberOfWords {
	public static void main(String[] args) {
		String str="hello world how are you";
		int count=0;
		
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			String st=split[i];
			System.out.println(st);
			count++;
		}
		System.out.println("total words count: "+count);
	}

}
