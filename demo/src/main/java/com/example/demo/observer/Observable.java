package com.example.demo.observer;


public interface Observable {
	public void register(Observer reader);
	public void unregister(Observer reader);
	void notiffy(boolean isLatestNews);
}
