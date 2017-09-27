package com.example.demo.decorator.decorator;


public class ConcreDecortorA extends Decorator {
	
	@Override
	public void operation() {
		this.component.operation();
		System.out.println("decoraterA");
	}
	
	
}
