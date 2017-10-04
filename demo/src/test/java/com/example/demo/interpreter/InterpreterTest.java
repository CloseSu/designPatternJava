package com.example.demo.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class InterpreterTest {

	@Test
	public void interpreterTest() {
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for(AbstractExpression exp: list) {
			exp.intepret(context);
		}
		
	}
}
