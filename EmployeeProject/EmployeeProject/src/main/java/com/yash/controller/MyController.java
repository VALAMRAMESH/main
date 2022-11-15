package com.yash.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yash.model.Employee;
import com.yash.service.ServiceI;
import com.google.gson.Gson;

@CrossOrigin("*")
@RestController
public class MyController {

	@Autowired
	ServiceI ser;

	/*
	 * @RequestMapping(value = "/save",method = RequestMethod.POST,consumes =
	 * MediaType.MULTIPART_FORM_DATA_VALUE) public String Save(@RequestBody Employee
	 * emp,@RequestPart(required = true,value = "uploadResume") MultipartFile file1,
	 * 
	 * @RequestPart("doc") String doc) throws IOException {
	 * 
	 * //Employee emp1=new Employee(); emp.setUploadResume(file1.getBytes());
	 * 
	 * Gson gson=new Gson(); Employee emp1=gson.fromJson(doc, Employee.class);
	 * emp.setUniqueNo(emp1.getUniqueNo()); System.out.println(emp);
	 * ser.saveData(emp); return "data save"; }
	 */

	@PostMapping("/save")
	public String save(@RequestBody Employee emp) {
		ser.saveData(emp);
		return "data Save";
	}

	@GetMapping("/show")
	public List<Employee> show() {
		return ser.showData();
	}

	@GetMapping("/login/{userName}/{password}")
	public List<Employee> showPerticularData(@PathVariable String userName, @PathVariable String password) {
		return ser.showPerticularEmployee(userName, password);
	}

	@PutMapping("/update/{uniqueNo}")
	public Employee updateEmployee(@RequestBody Employee emp, @PathVariable int uniqueNo) {
		System.out.println("in update method");
		return ser.updateData(emp);
	}

	@GetMapping("/getemp/{uniqueNo}")
	public Employee getEmployee(@PathVariable int uniqueNo) {
		Employee emp = ser.getEmployee(uniqueNo);
		return emp;

	}

	@DeleteMapping("/delete/{uniqueNo}")
	public List<Employee> deleteEmployee(@PathVariable int uniqueNo) {
		ser.deleteEmployee(uniqueNo);
		List<Employee> lemp = ser.showData();
		return lemp;
	}

}
