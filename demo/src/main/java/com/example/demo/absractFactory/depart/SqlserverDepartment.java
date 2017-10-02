package com.example.demo.absractFactory.depart;

public class SqlserverDepartment implements IDepartment {

	@Override
	public
	void insert(Department department) {
		System.out.println("在SQL SERVER中給DEPARTMENT表增加一條紀錄");
	}

	@Override
	public
	Department getDepartment(int id) {
		System.out.println("在SQL SERVER中給DEPARTMENT表取得一條紀錄");
		return null;
	}

}
