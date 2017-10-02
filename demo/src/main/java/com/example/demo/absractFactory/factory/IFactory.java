package com.example.demo.absractFactory.factory;

import com.example.demo.absractFactory.depart.IDepartment;
import com.example.demo.absractFactory.user.IUser;

public interface IFactory {
	IUser CreateUser() throws Exception;
	IDepartment CreateDepartment() throws Exception;
}
