package com.atmecs.bionetoone.employee;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "emptable")

public class Employee {
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeContact employeeContact;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "Sno")
private int sno;

@Column(name = "Name")
private String name;

@Column(name = "Salary")
private int salary;
public Employee()
{
}
public Employee(String name,int salary)
{
	this.name = name;
	this.salary = salary;
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public EmployeeContact getEmployeeContact() {
	return employeeContact;
}
public void setEmployeeContact(EmployeeContact employeeContact) {
	this.employeeContact = employeeContact;
}

}
