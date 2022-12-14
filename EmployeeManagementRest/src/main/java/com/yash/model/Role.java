package com.yash.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Role 
{
	
	@Id
	private long roleId;
	private String roleName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "role")
	private Set<UserRole> userRole= new HashSet<>();
	
	

	public Set<UserRole> getUserRole()
	{
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Role(long roleId, String roleName, Set<UserRole> userRole) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.userRole = userRole;
	}

	public Role() {
		// TODO Auto-generated constructor stub
	}
	
}
