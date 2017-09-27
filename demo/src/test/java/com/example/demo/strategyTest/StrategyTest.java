package com.example.demo.strategyTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.strategy.Context;
import com.example.demo.strategy.concreteStrategy.ConcreteStrateA;
import com.example.demo.strategy.concreteStrategy.ConcreteStrateB;
import com.example.demo.strategy.concreteStrategy.ConcreteStrateC;

@RunWith(SpringJUnit4ClassRunner.class)
public class StrategyTest {

	@Test
	public void strategyTest() {
		new Context(new ConcreteStrateA()).useAlgorithm();
		new Context(new ConcreteStrateB()).useAlgorithm();
		new Context(new ConcreteStrateC()).useAlgorithm();
	}
}
