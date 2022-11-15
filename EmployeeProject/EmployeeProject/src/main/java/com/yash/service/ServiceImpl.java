package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Employee;
import com.yash.repository.MyRepository;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	MyRepository mr;

	@Override
	public String saveData(Employee emp) {

		mr.save(emp);
		return "Data save Successfully";
	}

	@Override
	public List<Employee> showData() {

		return mr.findAll();
	}

	@Override
	public List<Employee> showPerticularEmployee(String userName, String password) {

		return mr.findByUserNameAndPassword(userName, password);
	}

	@Override
	public Employee updateData(Employee emp) {

		return mr.save(emp);
	}

	@Override
	public Employee getEmployee(int uniqueNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int uniqueNo) {
		// TODO Auto-generated method stub
		mr.deleteById(uniqueNo);

	}

	/*
	 * @Override public void deleteEmployee(int uniqueNo) { mr.deleteById(uniqueNo);
	 * 
	 * }
	 */

}
