package com.example.demo.simplefactory.factory;

import com.example.demo.simplefactory.Circle;
import com.example.demo.simplefactory.Square;
import com.example.demo.simplefactory.interfac.Shape;

public class SimpleFactory {
	
	Shape shape;
	
	public Shape createShape(String product) {
		if (product.equals("circle")) {
			shape = new Circle();
		} else if (product.equals("square")){
			shape = new Square();
		} 
		return shape;
	}	
}
