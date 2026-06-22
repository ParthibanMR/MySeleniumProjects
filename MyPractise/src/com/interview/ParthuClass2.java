package com.interview;

public class ParthuClass2 extends ParthuAbstarct{
	


	public static void main(String[] args) {
		ParthuClass pc=new ParthuClass();
		pc.animalSound();
		pc.run();
	
	}

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("newly");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
		
	}

}
