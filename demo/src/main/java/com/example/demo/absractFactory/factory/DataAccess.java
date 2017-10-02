package com.example.demo.absractFactory.factory;

import com.example.demo.absractFactory.depart.IDepartment;
import com.example.demo.absractFactory.user.IUser;

public class DataAccess implements IFactory {

	private String category;
	private String userPrefix = "com.example.demo.absractFactory.user.";
	private String departmentPrefix = "com.example.demo.absractFactory.depart.";
	
	
	public void setCategpry(String category) {
		this.category = category;
	}
	
	@Override
	public IUser CreateUser() throws Exception {
		String userName = this.category + "User";
		return (IUser) Class.forName(userPrefix + userName).newInstance() ;
	}

	@Override
	public IDepartment CreateDepartment() throws Exception {
		String userName = this.category + "Department";
		return (IDepartment)  Class.forName(departmentPrefix + userName).newInstance();
	}
	
}
