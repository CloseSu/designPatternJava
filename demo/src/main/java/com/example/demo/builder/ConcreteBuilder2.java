package com.example.demo.builder;

public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("零件X");
	}

	@Override
	public void buildPartB() {
		product.add("零件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
