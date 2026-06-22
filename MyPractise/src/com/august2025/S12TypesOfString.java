package com.august2025;

public class S12TypesOfString {
	public static void main(String[] args) {
		//1. Litreal (inside heap memory - > string pool or string constant)
		//incase of duplicate It will share same memory
		
		String litreal="Welcome";
		System.out.println(System.identityHashCode(litreal));
		String litreal2="Welcome";
		System.out.println(System.identityHashCode(litreal2));
		System.out.println(litreal==litreal2);
		
		//2. Non-litreal (heap memory)
		//incase of duplicate It will share different memory
		String l1=new String("Parthi");
		System.out.println(System.identityHashCode(l1));
		String l2=new String("Parthi");
		System.out.println(System.identityHashCode(l2));
		
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		
		//Immutable 
		String s1="java";
		System.out.println(System.identityHashCode(s1));
		String concat = s1.concat(" Hello"); // create new object
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		System.out.println(s1);
		
		//Mutable (String Builder/ String Buffer)
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(System.identityHashCode(sb));
		StringBuilder append = sb.append(" World");
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		//Stringbuffer and sstring builer methods ->append(), insert(), replace(), delete(), reverse(), capacity(), length(), charAT(), setCharAT(), ensureCapacity()
	}

}
