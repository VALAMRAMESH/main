package com.yash.serviceimpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Employee;
import com.yash.model.UserRole;
import com.yash.repository.EmployeeRepository;
import com.yash.repository.RoleRepository;
import com.yash.service.EmployeeService;




	@Service
	public class EmployeeServiceImpl implements EmployeeService {
		@Autowired
		EmployeeRepository employeeRepo;
		
		@Autowired
		RoleRepository rr;
		
		

		@Override
		public Optional<Employee> getData(long slNo) throws IOException {
			
			Optional<Employee> employee= employeeRepo.findById(slNo);
			
			 // FileOutputStream fileOutputStream=newFileOutputStream(employee.get().getFileName());
			 // fileOutputStream.write(employee.get().getResume());
			 
			return employee;
		}

		@Override
		public List<Employee> getAllData() {
			
			List<Employee> employees= employeeRepo.findAll();
			return employees;
		}

		@Override
		public Employee createUser(Employee employee2, Set<UserRole> userRoles) throws Exception {
			
			Employee local= this.employeeRepo.findByUsername(employee2.getUsername());
			if(local!=null)
			{
				System.out.println("user is already present !!");
				throw new Exception("user is already present !!");
			}
			else
			{
				for(UserRole uro:userRoles) 
				{
					rr.save(uro.getRole());
					
				}
				employee2.getUserRoles().addAll(userRoles);
				local = this.employeeRepo.save(employee2);
			}
			
			return local;
		}

		@Override
		public void deleteEmployee(long slNo) {
			this.employeeRepo.deleteById(slNo);
			
		}

		@Override
		public Employee updateEmployee(Employee employee) {
			
			return this.employeeRepo.save(employee);
		}
		

	}



