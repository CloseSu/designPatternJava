package com.example.demo.absractFactory.depart;

public class AccessDepartment implements IDepartment {

	@Override
	public
	void insert(Department department) {
		System.out.println("在ACESS 中給DEPARTMENT表增加一條紀錄");
	}

	@Override
	public
	Department getDepartment(int a) {
		System.out.println("在ACESS中給DEPARTMENT表取得一條紀錄");
		return null;
	}

}
