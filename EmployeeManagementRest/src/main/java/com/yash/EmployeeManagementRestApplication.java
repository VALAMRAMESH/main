package com.yash;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.yash.model.Employee;
import com.yash.model.Role;
import com.yash.model.UserRole;
import com.yash.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementRestApplication implements CommandLineRunner
{

	@Autowired
	private EmployeeService es;
	
	@Autowired
	private BCryptPasswordEncoder bpe;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementRestApplication.class, args);
		
	}
	@Override
		public void run(String... args)throws Exception{
			System.out.println("code is running");
		
		
		//hardcoding data for admin input
		
//		  Employee e= new Employee(); e.setEmployeeId(11111); e.setEmpName("admin");
//		  e.setUsername("sirji"); e.setPassword(this.bpe.encode("123456"));
//		  e.setProfile("admin");
//		  
//		  Role role1=new Role(); role1.setRoleId(50L); role1.setRoleName("admin");
//		  
//		  Set<UserRole> userRoleSet = new HashSet<>(); UserRole usr= new UserRole();
//		  usr.setRole(role1); usr.setEmployee(e);
//		  
//		  userRoleSet.add(usr); Employee emp1=this.es.createUser(e, userRoleSet);
//		  System.out.println(emp1.getUsername());
		 
		}
	

}
