package com.march2026;

public class GreensBank2 implements IciciBankFullyAbstarction{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("10%");
		
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		
		System.out.println("23%");
	}
	public static void main(String[] args) {
		GreensBank2 gb2=new GreensBank2();
		gb2.deposit();
		gb2.fixed();
		gb2.savings();
		gb2.savings2();
	}

}
