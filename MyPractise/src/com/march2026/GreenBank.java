package com.march2026;


public class GreenBank extends IcicBankPartiallyAbstarction{
		@Override
		public void deposit() {
			// TODO Auto-generated method stub
			System.out.println("10%");
		}

		@Override
		public void fd() {
			// TODO Auto-generated method stub
			System.out.println("12%");
			
		}
		public static void main(String[] args) {
			GreenBank gb=new GreenBank();
			gb.deposit();
			gb.fd();
			gb.savings();
			
		}

}
