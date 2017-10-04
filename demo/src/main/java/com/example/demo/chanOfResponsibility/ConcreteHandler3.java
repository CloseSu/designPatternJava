package com.example.demo.chanOfResponsibility;

public class ConcreteHandler3 extends Handler {

	@Override
	public void HandlerRequest(int request) {
		if(request >= 20 && request < 30 ) {
			System.out.println(this.getClass().getName() + " 處裡請求" + request);
		}else if(this.successor != null) {
			successor.HandlerRequest(request);
		}
		
	}
	
}
