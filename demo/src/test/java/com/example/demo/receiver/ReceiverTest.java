package com.example.demo.receiver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.command.Command;
import com.example.demo.command.ConcreteCpommand;
import com.example.demo.command.Invoker;
import com.example.demo.command.Receiver;

@RunWith(SpringRunner.class)
public class ReceiverTest {

	@Test
	public void receiverTest() {
		Receiver r = new Receiver();
		Command c = new ConcreteCpommand(r);
		Invoker i  = new Invoker();
		
		i.setCommand(c);
		i.execCommand();
	}
}
