package com.example.demo.interpreter;

public class TerminalExpression extends AbstractExpression {

	@Override
	public void intepret(Context context) {
		System.out.println("終端解譯器");
	}

}
