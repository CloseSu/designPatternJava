package com.example.demo.command;

public class Invoker {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execCommand() {
		command.execute();
	}
}
