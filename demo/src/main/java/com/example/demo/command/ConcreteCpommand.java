package com.example.demo.command;

public class ConcreteCpommand extends Command {

	public ConcreteCpommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		this.receiver.action();
	}

}
