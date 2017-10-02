package com.example.demo.adapteTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.adapter.Adapter;
import com.example.demo.adapter.Target;

@RunWith(SpringRunner.class)
public class AdapterTest {

	@Test
	public void adapterTest() {
		Target target = new Adapter();
		target.Request();
	}
}
