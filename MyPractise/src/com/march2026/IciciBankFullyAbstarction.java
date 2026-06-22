package com.march2026;

public interface IciciBankFullyAbstarction {
	public abstract void deposit();
	public abstract void fixed();
	
	default void savings() {
		System.out.println("hi");
	}
	default void savings2() {
		System.out.println("hi2");
	}
	

}
