package com.example.demo.iteratorTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.iterator.ConcreteAggretate;
import com.example.demo.iterator.ConcreteIterator;
import com.example.demo.iterator.Iterator;

@RunWith(SpringRunner.class)
public class IteratorTest {

	@Test
	public void iteratorTest() {
		ConcreteAggretate a = new ConcreteAggretate();
		a.getItems().add(0, "大鳥");
		a.getItems().add(1, "小菜");
		a.getItems().add(2, "行李");
		a.getItems().add(3, "老外");
		a.getItems().add(4, "巴士內部員工");
		a.getItems().add(5, "小偷");
		
		Iterator i = new ConcreteIterator(a);
		while(!i.isDone()) {
			System.out.println(i.currentItem()+" 請買車票");
			i.next();
		}
		
	}
}
