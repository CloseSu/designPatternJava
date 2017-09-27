package com.example.demo.proxy;

public class RealSubject extends Subject {

	@Override
	public void Request() {
		System.out.println("Real request");
	}

}
