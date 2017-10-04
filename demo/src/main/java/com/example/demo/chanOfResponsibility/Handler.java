package com.example.demo.chanOfResponsibility;

public abstract class Handler {
	Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void HandlerRequest(int request);
}
