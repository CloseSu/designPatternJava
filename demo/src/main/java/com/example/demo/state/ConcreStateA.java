package com.example.demo.state;

public class ConcreStateA extends State {

	@Override
	public void Handle(Context context) {
		context.setState(new ConcreStateB());
	}

}
