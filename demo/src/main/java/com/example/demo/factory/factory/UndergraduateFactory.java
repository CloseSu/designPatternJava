package com.example.demo.factory.factory;

import com.example.demo.factory.object.Nightinggale;
import com.example.demo.factory.object.Undergraduate;

public class UndergraduateFactory implements IFactory {

	@Override
	public Nightinggale CreateNightinggale() {
		return new Undergraduate();
	}

}
