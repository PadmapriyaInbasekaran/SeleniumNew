package com.atmecs.onetomany.empdetails;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "newemptable")
public class Employee {
	@ManyToOne
	@JoinColumn(name = "DeptId")
	private EmployeeDept employeedept;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sno")
	private int Sno;
	@Column(name = "Name")
	private String name;

	@Column(name = "Salary")
	private int salary;

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

	public EmployeeDept getEmployeedept() {
		return employeedept;
	}

	public void setEmployeedept(EmployeeDept employeedept) {
		this.employeedept = employeedept;
	}





}
