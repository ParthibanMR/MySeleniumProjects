
public class Switchjava12 {
	public static void main(String[] args) {
		System.out.println(traditionalSwitch(1));
		System.out.println(traditionalSwitch(6));
		System.out.println(traditionalSwitch(10));
	}
	
    	 	public static String traditionalSwitch(int number) {
    	 		String result="";
    	 		switch(number) {
    	 		case 1:
    	 		case 2:
    	 			result="one or two";
    	 			break;
    	 		case 3:
    	 			result="three";
    	 			break;
    	 		case 4:
    	 			result="four";
    	 			break;
    	 		case 5:
    	 		case 6:
    	 			result="five or six";
    	 			break;
    	 			
    	 		default:
    	 			result ="unknown";
    	 			
    	 		};
    	 		return result;
    	 		}
    	 		
     


}
