package com.atemcs.allinone.employeedb;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeManyToMany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;
	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="empproject", joinColumns= {@JoinColumn(name="id")},  inverseJoinColumns= {@JoinColumn(name="projectid")})
    private Set<EmployeeProject> project ;
	public EmployeeManyToMany()
	{
	}
	public EmployeeManyToMany(String name,String email)
	{
		this.name = name;
		this.email = email;
		}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<EmployeeProject> getProject() {
		return project;
	}
	
	public void setProject(Set<EmployeeProject> project) {
		this.project = project;
	}


	}

