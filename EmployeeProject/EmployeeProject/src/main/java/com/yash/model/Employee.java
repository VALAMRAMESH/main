package com.yash.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uniqueNo;
	private String employeeName;
	private String userName;
	private String password;
	private double totalYearOfITExperience;
	private String projectAllocated;
	private String projectName;
	private String lastWorkingDate;
	private String[] primarySkill;
	private int angular,reactJS,nodeJS,html,jQuery;
	private int coreJava,java8;
	private int jsp,servlet;
	private int springMVC,springJPA,springSecurity,springBoot;
	private int hibernate;
	private int oracle,mysql,postgress,mssql,nosql;
	private int linux;
	private int git,docker;
	private int aws,springCloud,google;
	private String uploadedResumeInYashPortal;
	
	@Lob
	private byte[] uploadResume;
	private String interest;
	private String email;
	private String mobileNo;
	private String baseLocation;
	private String preferedLocation;
	private String ctc,dateOfJoining;
	public int getUniqueNo() {
		return uniqueNo;
	}
	public void setUniqueNo(int uniqueNo) {
		this.uniqueNo = uniqueNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getTotalYearOfITExperience() {
		return totalYearOfITExperience;
	}
	public void setTotalYearOfITExperience(double totalYearOfITExperience) {
		this.totalYearOfITExperience = totalYearOfITExperience;
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
	public String getLastWorkingDate() {
		return lastWorkingDate;
	}
	public void setLastWorkingDate(String lastWorkingDate) {
		this.lastWorkingDate = lastWorkingDate;
	}
	
	public String[] getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String[] primarySkill) {
		this.primarySkill = primarySkill;
	}
	public int getAngular() {
		return angular;
	}
	public void setAngular(int angular) {
		this.angular = angular;
	}
	public int getReactJS() {
		return reactJS;
	}
	public void setReactJS(int reactJS) {
		this.reactJS = reactJS;
	}
	public int getNodeJS() {
		return nodeJS;
	}
	public void setNodeJS(int nodeJS) {
		this.nodeJS = nodeJS;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getjQuery() {
		return jQuery;
	}
	public void setjQuery(int jQuery) {
		this.jQuery = jQuery;
	}
	public int getCoreJava() {
		return coreJava;
	}
	public void setCoreJava(int coreJava) {
		this.coreJava = coreJava;
	}
	public int getJava8() {
		return java8;
	}
	public void setJava8(int java8) {
		this.java8 = java8;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getServlet() {
		return servlet;
	}
	public void setServlet(int servlet) {
		this.servlet = servlet;
	}
	public int getSpringMVC() {
		return springMVC;
	}
	public void setSpringMVC(int springMVC) {
		this.springMVC = springMVC;
	}
	public int getSpringJPA() {
		return springJPA;
	}
	public void setSpringJPA(int springJPA) {
		this.springJPA = springJPA;
	}
	public int getSpringSecurity() {
		return springSecurity;
	}
	public void setSpringSecurity(int springSecurity) {
		this.springSecurity = springSecurity;
	}
	public int getSpringBoot() {
		return springBoot;
	}
	public void setSpringBoot(int springBoot) {
		this.springBoot = springBoot;
	}
	public int getHibernate() {
		return hibernate;
	}
	public void setHibernate(int hibernate) {
		this.hibernate = hibernate;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getMysql() {
		return mysql;
	}
	public void setMysql(int mysql) {
		this.mysql = mysql;
	}
	public int getPostgress() {
		return postgress;
	}
	public void setPostgress(int postgress) {
		this.postgress = postgress;
	}
	public int getMssql() {
		return mssql;
	}
	public void setMssql(int mssql) {
		this.mssql = mssql;
	}
	public int getNosql() {
		return nosql;
	}
	public void setNosql(int nosql) {
		this.nosql = nosql;
	}
	
	public int getLinux() {
		return linux;
	}
	public void setLinux(int linux) {
		this.linux = linux;
	}
	public int getGit() {
		return git;
	}
	public void setGit(int git) {
		this.git = git;
	}
	public int getDocker() {
		return docker;
	}
	public void setDocker(int docker) {
		this.docker = docker;
	}
	public int getAws() {
		return aws;
	}
	public void setAws(int aws) {
		this.aws = aws;
	}
	public int getSpringCloud() {
		return springCloud;
	}
	public void setSpringCloud(int springCloud) {
		this.springCloud = springCloud;
	}
	public int getGoogle() {
		return google;
	}
	public void setGoogle(int google) {
		this.google = google;
	}
	public String getUploadedResumeInYashPortal() {
		return uploadedResumeInYashPortal;
	}
	public void setUploadedResumeInYashPortal(String uploadedResumeInYashPortal) {
		this.uploadedResumeInYashPortal = uploadedResumeInYashPortal;
	}
	public byte[] getUploadResume() {
		return uploadResume;
	}
	public void setUploadResume(String uploadResume) {
		this.uploadResume = uploadResume.getBytes();
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setUploadResume(byte[] uploadResume) {
		this.uploadResume = uploadResume;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getPreferedLocation() {
		return preferedLocation;
	}
	public void setPreferedLocation(String preferedLocation) {
		this.preferedLocation = preferedLocation;
	}
	public String getCtc() {
		return ctc;
	}
	public void setCtc(String ctc) {
		this.ctc = ctc;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [uniqueNo=" + uniqueNo + ", employeeName=" + employeeName + ", userName=" + userName
				+ ", password=" + password + ", totalYearOfITExperience=" + totalYearOfITExperience
				+ ", projectAllocated=" + projectAllocated + ", projectName=" + projectName + ", lastWorkingDate="
				+ lastWorkingDate + ", primarySkill=" + Arrays.toString(primarySkill) + ", angular=" + angular
				+ ", reactJS=" + reactJS + ", nodeJS=" + nodeJS + ", html=" + html + ", jQuery=" + jQuery
				+ ", coreJava=" + coreJava + ", java8=" + java8 + ", jsp=" + jsp + ", servlet=" + servlet
				+ ", springMVC=" + springMVC + ", springJPA=" + springJPA + ", springSecurity=" + springSecurity
				+ ", springBoot=" + springBoot + ", hibernate=" + hibernate + ", oracle=" + oracle + ", mysql=" + mysql
				+ ", postgress=" + postgress + ", mssql=" + mssql + ", nosql=" + nosql + ", linux=" + linux + ", git="
				+ git + ", docker=" + docker + ", aws=" + aws + ", springCloud=" + springCloud + ", google=" + google
				+ ", uploadedResumeInYashPortal=" + uploadedResumeInYashPortal + ", uploadResume="
				+ Arrays.toString(uploadResume) + ", interest=" + interest + ", email=" + email + ", mobileNo="
				+ mobileNo + ", baseLocation=" + baseLocation + ", preferedLocation=" + preferedLocation + ", ctc="
				+ ctc + ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	
	
	
	
	
}

/*
 * Unique.No. Text Autogenerated Total years of IT Experience Numeric I/P
 * Project Allocated Drop down Selection Project Name Text I/P Last working date
 * Date I/P Primary Skills Drop down Selection UI Fields Text Label Angular
 * Numeric I/P ReactJs Numeric I/P NodeJS Numeric I/P HTML/CSS/Javascript
 * Numeric I/P Jquery Numeric I/P Rating Drop down Selection Java Text Label
 * "Core Java" Numeric I/P Java 8 Numeric I/P Rating Drop down Selection Web
 * Technologies Text Label "JSP, Servlet" Numeric I/P Spring Stack Text Label
 * Spring MVC Numeric I/P Spring JPA Numeric I/P Spring Security Numeric I/P
 * Spring Boot Numeric I/P Rating Drop down Selection ORM Text Label Hibernate
 * Numeric I/P Rating Drop down Selection Databases Text Label Oracle Numeric
 * I/P MySQL Numeric I/P Postgress Numeric I/P MSSQL Numeric I/P NoSQL Numeric
 * I/P Rating Drop down Selection Operating System Text Label Linux Numeric I/P
 * Repository Text Label GIT Numeric I/P Docker Numeric I/P Cloud Computing Text
 * Label Rating Drop down Selection AWS Numeric I/P Spring Cloud Numeric I/P
 * Google Numeric I/P Rating Drop down Selection Others Text Label Uploaded
 * Resume in Yash portal Drop down Selection Upload Resume Button - Interests
 * Text I/P YASH Email Address Text I/P Mobile No. Numeric I/P Yash Base
 * Location Drop down Selection Prefered location for the employee Text I/P CTC
 * Text I/P Date Of Joining Text I/P
 */
