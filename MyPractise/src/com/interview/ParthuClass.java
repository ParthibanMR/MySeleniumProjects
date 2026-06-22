package com.interview;

public class ParthuClass implements ParthuParthuInterface{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Animal sound");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		ParthuClass2 pc=new ParthuClass2();
		pc.animalSound();
		pc.run();
	}

}
