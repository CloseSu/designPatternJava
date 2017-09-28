package com.example.demo.facade;

public class Facade {
	private SubSystemOne one;
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;
	
	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA() {
		System.out.println("method A");
		one.method();
		two.method();
		three.method();
		four.method();
	}
	
	public void methodB() {
		System.out.println("method B");
		one.method();
		two.method();
		three.method();
		four.method();
	}

}
