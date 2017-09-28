package com.example.demo.observer;

public class Reader implements Observer {

	private String name = null;
	private Observable news = null;
	
	public Reader(String name){
		this.name = name;
	}
	
	@Override
	public void subscribe(Observable news) {
		this.news = news;
		news.register(this);
	}

	@Override
	public void unsubscribe() {
		news.unregister(this);
	}

	@Override
	public void update(boolean isLastestNews) {
		read(isLastestNews);
	}

	private void read(boolean latestNews){
		if(latestNews){
			System.out.println(name + " read latest news");
		} else {
			System.out.println(name + " read old news");
		}
	}
}
