package com.example.demo.absractFactory.user;

public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在SQL SERVER中給USER表增加一條紀錄");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在SQL SERVER中給USER表查詢一條紀錄");
		return null;
	}

}
