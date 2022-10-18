package com.yash.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yash.model.Employee;
import com.yash.repository.EmployeeRepository;
@Service
public class UserDetailServiceImpl implements UserDetailsService
{
@Autowired
private EmployeeRepository er;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee = this.er.findByUsername(username);
		if(employee ==null)
		{
			System.out.println("Employee not found");
			throw new UsernameNotFoundException("No Employee found!!!");
		}
		return employee;
		
		
	}

}
