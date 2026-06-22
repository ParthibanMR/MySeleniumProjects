package com.string;

public class NameExtractor2 {
	public static void main(String[] args) {
		String input = "parthi))))m.rcksytems.com";
         String[] parts = input.split("[^A-za-z]+");
         
//         for (int i = 0; i < parts.length; i++) {
//			String sh=parts[i];
//			System.out.println(sh);
//		}
         
         if (parts.length>=2) {
			String fistName=capatilizeFirstLetter(parts[0]);
			String lastName=parts[1].substring(0).toUpperCase();
					
			System.out.println(fistName+" "+lastName);
		}else {
			System.out.println("there is no name");
		}
		
	}

	private static String capatilizeFirstLetter(String s) {
		if (s==null || s.isEmpty()) {
			return s;
		}
		
		return s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
		
		
	}

}
