package com.example.demo.interpreter;

public class NonterminalExpression extends AbstractExpression {

	@Override
	public void intepret(Context context) {
		System.out.println("非終端解譯器");
	}

}
