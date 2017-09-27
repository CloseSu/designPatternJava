package com.example.demo.decorator.decorator;


public class ConcreDecortorB extends Decorator {
	
	@Override
	public void operation() {
		this.component.operation();
		System.out.println("decoraterB");
	}
	
	
}
