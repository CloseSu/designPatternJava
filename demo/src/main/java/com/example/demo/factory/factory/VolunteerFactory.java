package com.example.demo.factory.factory;

import com.example.demo.factory.object.Nightinggale;
import com.example.demo.factory.object.Volunteer;

public class VolunteerFactory implements IFactory {

	@Override
	public Nightinggale CreateNightinggale() {
		return new Volunteer();
	}

}
