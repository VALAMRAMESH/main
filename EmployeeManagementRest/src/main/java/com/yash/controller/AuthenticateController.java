package com.yash.controller;


import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.configuration.JwtUtils;
import com.yash.model.Employee;
import com.yash.model.JwtRequest;
import com.yash.model.JwtResponse;
import com.yash.serviceimpl.UserDetailServiceImpl;



@CrossOrigin("*")

@RestController
public class AuthenticateController 
{
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailServiceImpl userDetailServiceImpl;
	
	@Autowired
	private JwtUtils jwtUtils;

	
	
	
	//generate tokens
	
	@PostMapping("/generate-token")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception
	{
		try {
			
			authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
			
		} catch (UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("employee not found");
		}
	
	
	//authenticate
		
	UserDetails userDetails= this.userDetailServiceImpl.loadUserByUsername(jwtRequest.getUsername());
	String token=this.jwtUtils.generateToken(userDetails);
	return ResponseEntity.ok( new JwtResponse(token));
	
	
	}
	
	private void authenticate(String username,String password) throws Exception
	{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
			
		} catch (DisabledException e) {
			
			throw new Exception("USER DISABLED" +e.getMessage());
		}
		catch (BadCredentialsException e) {
			
			throw new Exception("invalid credentials" +e.getMessage());
		}
	}
	
	 //return the details of current user
    @GetMapping("/current-employee")
    public Employee getCurrentUser(Principal principal) {
        return ((Employee) this.userDetailServiceImpl.loadUserByUsername(principal.getName()));

    }


}


