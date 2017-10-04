package com.example.demo.visitor;

public abstract class Element {
	public abstract void accept(Visitor visitor);
}
