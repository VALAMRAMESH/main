package com.example.angular.springbootcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.angular.springbootcrudapi.model.Employee;
import com.example.angular.springbootcrudapi.model.Project;
import com.example.angular.springbootcrudapi.repository.ProjectRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProjectController {
	
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	@PostMapping("/projects")
	public Project addProject(@RequestBody Project project)
	{
		return projectRepository.save(project);
		
	}
	
	@GetMapping("/projects")
    public ResponseEntity<List<Project>> getAllProjects(){
		return ResponseEntity.ok(projectRepository.findAll());
		
	}
	
	
	
		
		
		
		

	

}
