package com.atmecs.cascade.Employee;
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
@Table(name = "empcontact")
public class EmployeeContact implements Serializable{

	private static final long serialVersionUID = 1L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Sno")
	private Employee employee;
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ContactId")
private int contactid;
@Column(name = "Address")
private String address;

@Column(name = "PhNumber")
private int phnumber;

@Column(name = "Email")
private String email;


public EmployeeContact()
{
}
public EmployeeContact( String address, int phnumber,String email)
{
	
	this.address = address;
	this.phnumber = phnumber;
	this.email = email;
	
}



public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhNumber() {
	return phnumber;
}

public void setPhNumber(int phNumber) {
	this.phnumber = phNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
	
}

}
