package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>
{

}
