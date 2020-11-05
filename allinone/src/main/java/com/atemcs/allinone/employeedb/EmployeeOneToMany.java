package com.atemcs.allinone.employeedb;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class EmployeeOneToMany {
	@OneToMany(cascade = CascadeType.ALL)
	private Set<EmployeeSkills> employeeskills ;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;

@Column(name = "name")
private String name;

@Column(name = "email")
private String email;

public EmployeeOneToMany()
{
}
public EmployeeOneToMany(String name,String email)
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
@SuppressWarnings("rawtypes")
public Set getEmployeeskills() {
	return employeeskills;
}
@SuppressWarnings({ "rawtypes", "unchecked" })
public void setEmployeeskills( Set empskill) {
	this.employeeskills = empskill;
}

}
