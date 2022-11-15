package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpDao;

@Service
public class EmpService {
	
	
	@Autowired
	private EmpDao empDao;
	
	public void addEmp(Employee employee)
	{
		empDao.save(employee);
		
	}
	
	
	public List<Employee> getAllEmp()
	{
		return empDao.findAll();
		
	}
	
	public Employee getEmpById(int empId)
	{
		return empDao.findById(empId).get();
		
	}
	
	
	public Employee updateEmp(Employee employee,int empId)
	{
		return empDao.save(employee);
		
	}
	
	
	public void deleteEmployeeById(int empId) {
		empDao.deleteById(empId);
	}

}
