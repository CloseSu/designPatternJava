package com.example.demo.simplefactory;

import com.example.demo.simplefactory.interfac.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("===========Square=========");
	}

}
