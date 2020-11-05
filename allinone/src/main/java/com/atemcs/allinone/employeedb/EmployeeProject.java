package com.atemcs.allinone.employeedb;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class EmployeeProject {
	
	@ManyToMany
	private Set<EmployeeManyToMany> employee ;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "projectid")
	private String projectid;

	@Column(name = "projectname")
	private String projectname;


	public EmployeeProject()
	{

	}
	public EmployeeProject(String projectname)
	{
     
		this.projectname = projectname;
	}

	
	public String getProjectName() {
		return projectname;
	}
	public void setProjectName(String projectname) {
		this.projectname = projectname;
	}
	
	
	@SuppressWarnings("rawtypes")
	public Set getEmployee() {
		return employee;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setEmployee(Set employee) {
		this.employee = employee;
	}

}
