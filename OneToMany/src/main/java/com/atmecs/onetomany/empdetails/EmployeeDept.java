package com.atmecs.onetomany.empdetails;
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
@Table(name = "empdept")
public class EmployeeDept  {

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Employee> employee ;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DeptId")
	private int DeptId;

	@Column(name = "DeptName")
	private String DeptName;


	public EmployeeDept()
	{

	}
	public EmployeeDept(String DeptName)
	{

		this.DeptName = DeptName;
	}

	public String getCourseName() {
		return DeptName;
	}
	public void setCourseName(String courseName) {
		DeptName = courseName;
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
