package com.example.demo.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FacadeTest {

	@Test
	public void facadeTest() {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
	}
}
