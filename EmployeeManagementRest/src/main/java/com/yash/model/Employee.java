package com.yash.model;

import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Employee implements UserDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long slNo;
	private String profile;
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	private long employeeId;
	private int totalExperience;
	private String projectAllocated;
	private String projectName;
	private Date lWorkingDate;
	private String uploadedResume;
	private String interests;
	private String yashEmailAddress;
	private String mobileNo;
	private String yashBaseLocation;
	private String yashPreferedlocation;
	private double ctc;
	private String dateOfJoining;
	private String username;
	private String password;
	@Lob
	private byte[] resume;
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	@OneToMany(cascade = CascadeType.ALL)
	private List<Skills> skills;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "employee")
	@JsonIgnore
	 private Set<UserRole> userRoles= new HashSet<>();
	
	public long getSlNo() {
		return slNo;
	}
	public void setSlNo(long slNo) {
		this.slNo = slNo;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public String getProjectAllocated() {
		return projectAllocated;
	}
	public void setProjectAllocated(String projectAllocated) {
		this.projectAllocated = projectAllocated;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getYashBaseLocation() {
		return yashBaseLocation;
	}
	public void setYashBaseLocation(String yashBaseLocation) {
		this.yashBaseLocation = yashBaseLocation;
	}
	
	
	public Date getlWorkingDate() {
		return lWorkingDate;
	}
	public void setlWorkingDate(Date lWorkingDate) {
		this.lWorkingDate = lWorkingDate;
	}
	public String getUploadedResume() {
		return uploadedResume;
	}
	public void setUploadedResume(String uploadedResume) {
		this.uploadedResume = uploadedResume;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getYashEmailAddress() {
		return yashEmailAddress;
	}
	public void setYashEmailAddress(String yashEmailAddress) {
		this.yashEmailAddress = yashEmailAddress;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getYashPreferedlocation() {
		return yashPreferedlocation;
	}
	public void setYashPreferedlocation(String yashPreferedlocation) {
		this.yashPreferedlocation = yashPreferedlocation;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public byte[] getResume() {
		return resume;
	}
	public void setResume(byte[] resume) {
		this.resume = resume;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	
	public Employee(long slNo, String profile, String empName, long employeeId, int totalExperience,
			String projectAllocated, String projectName, Date lWorkingDate, String uploadedResume, String interests,
			String yashEmailAddress, String mobileNo, String yashBaseLocation, String yashPreferedlocation, double ctc,
			String dateOfJoining, String username, String password, byte[] resume, String fileName, List<Skills> skills,
			Set<UserRole> userRoles) {
		super();
		this.slNo = slNo;
		this.profile = profile;
		this.empName = empName;
		this.employeeId = employeeId;
		this.totalExperience = totalExperience;
		this.projectAllocated = projectAllocated;
		this.projectName = projectName;
		this.lWorkingDate = lWorkingDate;
		this.uploadedResume = uploadedResume;
		this.interests = interests;
		this.yashEmailAddress = yashEmailAddress;
		this.mobileNo = mobileNo;
		this.yashBaseLocation = yashBaseLocation;
		this.yashPreferedlocation = yashPreferedlocation;
		this.ctc = ctc;
		this.dateOfJoining = dateOfJoining;
		this.username = username;
		this.password = password;
		this.resume = resume;
		this.fileName = fileName;
		this.skills = skills;
		this.userRoles = userRoles;
	}
	
	public Employee()
	{
		
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<Authority> set = new HashSet<>();
		this.userRoles.forEach(userRole ->
		{
			set.add(new Authority(userRole.getRole().getRoleName()));
		});
		
		return set;
	}
	
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
	

}
