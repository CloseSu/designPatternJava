package com.example.demo.proxy;

public class Proxy extends Subject {

	RealSubject realSubject;
	
	@Override
	public void Request() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.Request();
	}

}
