package com.example.demo.composite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CompositeTest {

	@Test
	public void compositeTest() {
		Composite root = new Composite("root");
		
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp = new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		
		Composite comp2 = new Composite("Composite XY");
		comp2.add(new Leaf("Leaf XYA"));
		comp2.add(new Leaf("Leaf XYB"));
		
		comp.add(comp2);
		
		
		root.add(new Leaf("Leaf C"));
		Leaf leaf = new Leaf("Leaf D");
		
		root.add(leaf);
		root.remove(leaf);
		
		root.display(1);
		
	}
}
