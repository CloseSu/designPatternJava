package com.example.demo.chanOfResponsibilityTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.chanOfResponsibility.ConcreteHandler1;
import com.example.demo.chanOfResponsibility.ConcreteHandler2;
import com.example.demo.chanOfResponsibility.ConcreteHandler3;
import com.example.demo.chanOfResponsibility.Handler;

@RunWith(SpringRunner.class)
public class ChanOfResponsibilityTest {

	@Test
	public void corTest() {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] request = {2,5,14,22,18,27,30};
		
		for(int i: request) {
			h1.HandlerRequest(i);
		}
	}
}
