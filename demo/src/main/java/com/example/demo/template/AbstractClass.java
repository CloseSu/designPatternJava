package com.example.demo.template;

public abstract class AbstractClass {
	public abstract void primitiveOeration1();
	public abstract void primitiveOeration2();
	
	public void templateMethod() {
		primitiveOeration1();
		primitiveOeration2();
		System.out.println("fisished");
	}
}
