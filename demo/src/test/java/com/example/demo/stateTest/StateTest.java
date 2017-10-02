package com.example.demo.stateTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.state.ConcreStateA;
import com.example.demo.state.Context;

@RunWith(SpringRunner.class)
public class StateTest {

	@Test
	public void SateTest() {
		Context c = new Context(new ConcreStateA());
		c.Request();
		c.Request();
		c.Request();
		c.Request();
	}
}
