package com.example.demo.chanOfResponsibility;

public class ConcreteHandler2 extends Handler {

	@Override
	public void HandlerRequest(int request) {
		if(request >= 10 && request < 20 ) {
			System.out.println(this.getClass().getName() + " 處裡請求" + request);
		}else if(this.successor != null) {
			successor.HandlerRequest(request);
		}
		
	}
	
}
