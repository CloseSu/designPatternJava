package com.example.demo.builder;

public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("零件A");
	}

	@Override
	public void buildPartB() {
		product.add("零件B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
