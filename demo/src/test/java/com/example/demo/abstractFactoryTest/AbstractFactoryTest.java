package com.example.demo.abstractFactoryTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.absractFactory.depart.Department;
import com.example.demo.absractFactory.depart.IDepartment;
import com.example.demo.absractFactory.factory.AccessFactory;
import com.example.demo.absractFactory.factory.DataAccess;
import com.example.demo.absractFactory.factory.IFactory;
import com.example.demo.absractFactory.user.IUser;
import com.example.demo.absractFactory.user.User;

@RunWith(SpringRunner.class)
public class AbstractFactoryTest {

	@Test
	public void abstractFactoryTest() throws Exception {
		User user = new User();
		Department dept = new Department();
		
		IFactory factory = new AccessFactory();
		
		IUser iu = factory.CreateUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = factory.CreateDepartment();
		id.insert(dept);
		id.getDepartment(1);
		
	}
	

	@Test
	public void abstractFactoryReflectionTest() throws Exception {
		
		User user = new User();
		Department dept = new Department();
		
		DataAccess d = new DataAccess();
		d.setCategpry("Access");
		IUser iu = d.CreateUser();
		iu.insert(user);
		iu.getUser(1);
		IDepartment id = d.CreateDepartment();
		id.insert(dept);
		id.getDepartment(1);
		
	}
}
