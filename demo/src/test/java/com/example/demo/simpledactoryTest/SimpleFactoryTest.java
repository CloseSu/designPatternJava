package com.example.demo.simpledactoryTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.simplefactory.factory.SimpleFactory;

@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleFactoryTest {
	
	@Test
	public void testSimpleFactory() {
		SimpleFactory sf = new SimpleFactory();
		System.out.println("=====================");
		sf.createShape("circle").draw();
		System.out.println("=====================");
		sf.createShape("square").draw();
	}
}
