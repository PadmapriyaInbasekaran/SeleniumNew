package com.atmecs.cascade.Employee;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "emptable")
public class Employee {
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

}
