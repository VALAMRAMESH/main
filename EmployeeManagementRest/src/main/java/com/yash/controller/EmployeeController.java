package com.yash.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.catalina.connector.Response;
import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.model.Employee;
import com.yash.model.Role;
import com.yash.model.UserRole;
import com.yash.repository.EmployeeRepository;
import com.yash.service.EmployeeService;
	

	@RestController
	@CrossOrigin("*")
	@RequestMapping("/emp")
	public class EmployeeController {

		@Autowired
		EmployeeService employeeService;
		
		@Autowired
		EmployeeRepository employeeRepo;
		
		@Autowired
		private BCryptPasswordEncoder bCryptPasswordEncoder ;

		
		@PostMapping("/EmployeeUrl")
		public ResponseEntity<Response> saveData(@RequestParam("file") MultipartFile file, @RequestParam("employee") String employee )
				throws Exception {
			// Employee employee2=new Employee();
			byte[] data = file.getBytes();
			Employee employee2 = new ObjectMapper().readValue(employee, Employee.class);
			System.out.println(employee2);
			employee2.setPassword(this.bCryptPasswordEncoder.encode(employee2.getPassword() ));
			Set<UserRole> roles=new HashSet<>();
			Role role= new Role();
			role.setRoleId(55);
			role.setRoleName("Normal employee");
					  
			UserRole userRole= new UserRole(); 
			userRole.setEmployee(employee2);
			userRole.setRole(role);
			roles.add(userRole);
			employee2.setResume(data);
			employee2.setFileName(file.getOriginalFilename());
			employeeService.createUser(employee2,roles);
			return new ResponseEntity<Response>(new Response(), HttpStatus.OK);
		}

		 
			/*
			 * @PostMapping("/") public Employee createUser(@RequestBody Employee
			 * employee)throws Exception {
			 * employee.setPassword(this.bCryptPasswordEncoder.encode(employee.getPassword()
			 * )); Set<UserRole> roles=new HashSet<>();
			 * 
			 * Role role= new Role(); role.setRoleId(55);
			 * role.setRoleName("Normal employee");
			 * 
			 * UserRole userRole= new UserRole(); userRole.setEmployee(employee);
			 * userRole.setRole(role);
			 * 
			 * roles.add(userRole); 
			 * return this.employeeService.createUser(employee, roles);
			 * }
			 */

		@GetMapping("/getEmployee/{slNo}")
		public Optional<Employee> getEmployee(@PathVariable("slNo") long slNo) throws IOException {

		Optional<Employee> employee= employeeService.getData(slNo);

		return employee;
			
		}
		
		@GetMapping("/getEmployees")
		public List<Employee> getEmployee() {

		List<Employee> employees= employeeService.getAllData();

		return employees;
			
		}

		/*
		 * @GetMapping("/login") public String getString() { return "hello"; }
		 * // @PostMapping("/save") public String savedata(@RequestBody Employee
		 * employee){ employeeRepo.save(employee);
		 * 
		 * return "save data"; }
		 */
		@PutMapping("/update")
		public ResponseEntity<Employee> update(@RequestBody Employee employee)
		{
			return ResponseEntity.ok(this.employeeService.updateEmployee(employee));
		}
		@DeleteMapping("/delete/{slNo}")
		public void deleteUser(@PathVariable("slNo") long slNo)
		{
			this.employeeService.deleteEmployee(slNo);
		}
		
	}



