package com.example.demo.templateTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.template.AbstractClass;
import com.example.demo.template.ConcreteClassA;
import com.example.demo.template.ConcreteClassB;

@RunWith(SpringJUnit4ClassRunner.class)
public class TemplateTest {

	@Test
	public void templateTest() {
		AbstractClass c;
		
		c = new ConcreteClassA();
		c.templateMethod();
		
		c = new ConcreteClassB();
		c.templateMethod();
	}
}
