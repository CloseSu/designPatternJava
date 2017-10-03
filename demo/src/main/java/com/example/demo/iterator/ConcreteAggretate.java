package com.example.demo.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggretate extends Aggregate {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<Object> items = new ArrayList();
	
	@Override
	public Iterator CreateIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count() {
		return items.size();
	}

	public List<Object> getItems() {
		return items;
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}

}
