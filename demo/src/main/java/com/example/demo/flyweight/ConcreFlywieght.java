package com.example.demo.flyweight;

public class ConcreFlywieght extends Flyweight {

	@Override
	public void operation(int extrinsictate) {
		System.out.println("具體flyweight: " + extrinsictate);
	}

}
