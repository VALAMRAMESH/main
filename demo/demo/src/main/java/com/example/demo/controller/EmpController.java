package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;


@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/addEmp")
	public void addEmp(@RequestBody Employee employee)
	{
		empService.addEmp(employee);
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee>  getAllEmp()
	{
		return empService.getAllEmp();
		
	}
	
	@GetMapping("/getAllEmp/{empId}")
	public Employee getEmpById(@PathVariable int empId
			) {
		return empService.getEmpById(empId);
	}
	
	@PutMapping("/updateEmp/{empId}")
	public void updateEmp(@RequestBody Employee employee,@PathVariable int empId)
	{
		empService.updateEmp(employee, empId);
	}
	
	@DeleteMapping("/deleteEmpById/{empId}")
	public void deleteEmpById(@PathVariable int empId)
	{
		empService.deleteEmployeeById(empId);
	}

}
