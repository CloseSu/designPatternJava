package com.example.demo.flyweight;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class FlyweightTest {
	
	@Test
	public void  flyweightTest() {
		int extrinsicstate = 22;
		
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx = f.getFlyweight("x");
		fx.operation(--extrinsicstate);
		
		Flyweight fy = f.getFlyweight("y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("z");
		fz.operation(--extrinsicstate);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		
		uf.operation(--extrinsicstate);
		
	}
}
