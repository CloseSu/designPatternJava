package com.example.demo.iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggretate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggretate concreteAggretate) {
		this.aggregate = concreteAggretate;
	}

	@Override
	public Object first() {
		return aggregate.getItems().get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if(current < aggregate.count()) {
			ret = aggregate.getItems().get(current);
		}
		return ret;
	}

	@Override
	public Boolean isDone() {
		return current >= aggregate.count() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate.getItems().get(current);
	}

}
