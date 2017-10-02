package com.example.demo.state;

public class ConcreStateB extends State {

	@Override
	public void Handle(Context context) {
		context.setState(new ConcreStateA());
	}

}
