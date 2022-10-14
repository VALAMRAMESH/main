package com.example.angular.springbootcrudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.angular.springbootcrudapi.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
