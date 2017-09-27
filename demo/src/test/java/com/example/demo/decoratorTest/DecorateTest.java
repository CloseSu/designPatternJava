package com.example.demo.decoratorTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.decorator.component.ConcreteComponent;
import com.example.demo.decorator.decorator.ConcreDecortorA;
import com.example.demo.decorator.decorator.ConcreDecortorB;

@RunWith(SpringRunner.class)
public class DecorateTest {
	
	@Test
	public void decoratorTest() {
		ConcreteComponent c = new ConcreteComponent();
		ConcreDecortorA d1 = new ConcreDecortorA();
		ConcreDecortorB d2 = new ConcreDecortorB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}
}
