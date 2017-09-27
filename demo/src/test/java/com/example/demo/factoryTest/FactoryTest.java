package com.example.demo.factoryTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.factory.factory.IFactory;
import com.example.demo.factory.factory.UndergraduateFactory;
import com.example.demo.factory.object.Nightinggale;

@RunWith(SpringJUnit4ClassRunner.class)
public class FactoryTest {
	
	@Test
	public void factoryTest() {
		IFactory factory = new UndergraduateFactory();
		Nightinggale student = factory.CreateNightinggale();
		
		student.buyRice();
		student.sweep();
		student.wash();
	}
}
