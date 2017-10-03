package com.example.demo.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.sigleton.Singleton;

@RunWith(SpringRunner.class)
public class SingletonTest {

	@Test
	public void singleTest() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2) {
			System.out.println("2個物件是同個實體");
		}
	}
}
