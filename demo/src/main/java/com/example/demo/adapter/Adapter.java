package com.example.demo.adapter;

public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void Request() {
		adaptee.SpecificRequest();
	}
	
}
