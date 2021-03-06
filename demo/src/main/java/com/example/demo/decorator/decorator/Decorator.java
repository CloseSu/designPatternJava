package com.example.demo.decorator.decorator;

import com.example.demo.decorator.component.Component;

public class Decorator implements Component {

	Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}

	}

}
