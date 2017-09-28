package com.example.demo.observer;

public interface Observer {
	void subscribe(Observable news);
	void unsubscribe();
	void update(boolean isLastestNews);
}
