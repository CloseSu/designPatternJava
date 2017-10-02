package com.example.demo.absractFactory.factory;

import com.example.demo.absractFactory.depart.AccessDepartment;
import com.example.demo.absractFactory.depart.IDepartment;
import com.example.demo.absractFactory.user.AccessUser;
import com.example.demo.absractFactory.user.IUser;

public class AccessFactory implements IFactory {

	@Override
	public IUser CreateUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment CreateDepartment() {
		return new AccessDepartment();
	}
	
}
