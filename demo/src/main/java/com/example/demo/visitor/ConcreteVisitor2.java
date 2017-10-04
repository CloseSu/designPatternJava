package com.example.demo.visitor;

public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()+"被"+this.getClass().getName()+"存取");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName()+"被"+this.getClass().getName()+"存取");
	}

}
