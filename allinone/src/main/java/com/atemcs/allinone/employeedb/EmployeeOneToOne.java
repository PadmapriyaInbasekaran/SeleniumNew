package com.atemcs.allinone.employeedb;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class EmployeeOneToOne {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;

@Column(name = "name")
private String name;

@Column(name = "email")
private String email;

public EmployeeOneToOne()
{
}
public EmployeeOneToOne(String name,String email)
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


}
