package com.example.demo.visitor;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
	
	public void operationA() {
		
	}

}