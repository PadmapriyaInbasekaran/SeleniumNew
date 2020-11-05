package com.atemcs.allinone.employeedb;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "empdetails")
public class EmployeeDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private EmployeeOneToOne employee;
 	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "detailid")
	private int detailid;

@Column(name = "address")
private String address;

@Column(name = "Phno")
private int phno;

@Column(name = "salary")
private int salary;

@Column(name = "yoe")
private int yoe;
public EmployeeDetails()
{
}
public EmployeeDetails(int yoe, String address, int phno,int salary)
{
	
	this.address = address;
	this.phno = phno;
	this.yoe = yoe;
	this.salary = salary;
}



public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhNo() {
	return phno;
}

public void setPhNo(int phNo) {
	this.phno = phNo;
}
public int getYoe() {
	return yoe;
}
public void setYoe(int yoe) {
	this.yoe = yoe;
}
public int getSalary() {
	return yoe;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public EmployeeOneToOne getEmployee() {
	return employee;
}
public void setEmployee(EmployeeOneToOne employeeOneToOne) {
	this.employee= employeeOneToOne;
	
}

}
