package com.yash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;

@Repository
public interface MyRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByUserNameAndPassword(String userName, String password);
	
	

}
