package com.example.demo.flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsictate) {
		System.out.println("不共用具體flyweight: " + extrinsictate);
	}

}
