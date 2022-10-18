package com.yash.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.yash.model.Employee;
import com.yash.model.UserRole;



public interface EmployeeService 
{
	public Employee createUser(Employee employee2,Set<UserRole> userRoles)throws Exception;

	public Optional<Employee> getData(long slNo) throws IOException;
	
	public List<Employee> getAllData();
	
	public void deleteEmployee(long slNo);
	
	public Employee updateEmployee(Employee employee);

	

}
