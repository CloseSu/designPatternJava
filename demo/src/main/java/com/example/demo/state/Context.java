package com.example.demo.state;

public class Context {
	private State state;
	
	public Context(State state) {
		this.state = state;
	}
	
	public void Request() {
		System.out.println("Status: " + this.state.getClass().getName());
		this.state.Handle(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
