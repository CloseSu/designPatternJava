package com.example.demo.absractFactory.factory;

import com.example.demo.absractFactory.depart.IDepartment;
import com.example.demo.absractFactory.depart.SqlserverDepartment;
import com.example.demo.absractFactory.user.IUser;
import com.example.demo.absractFactory.user.SqlserverUser;

public class SqlfrverFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		return new SqlserverUser();
	}

	@Override
	public IDepartment CreateDepartment() {
		return new SqlserverDepartment();
	}

}
