package com.example.demo.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class VisitorTest {
	
	@Test
	public void visitorTest() {
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		
		o.accept(v1);
		o.accept(v2);
	}
}
