package com.example.demo.memento;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Memento.Caretaker;
import com.example.demo.Memento.Originator;

@RunWith(SpringRunner.class)
public class MementoTest {
	
	@Test
	public void mementoTest() {
		Originator o = new Originator();
		o.setState("on");
		o.show();
		
		Caretaker c = new Caretaker();
		c.setMomento(o.createMemento());
		
		o.setState("off");
		o.show();
		
		o.setMemento(c.getMomento());
		o.show();
	}
}
