package com.yash.service;

import java.util.List;

import com.yash.model.Employee;

public interface ServiceI {
	
	String saveData( Employee emp);

	List<Employee> showData();

	List<Employee> showPerticularEmployee(String userName,String password);

	Employee updateData(Employee emp);

	Employee getEmployee(int uniqueNo);

	void deleteEmployee(int uniqueNo);

}
