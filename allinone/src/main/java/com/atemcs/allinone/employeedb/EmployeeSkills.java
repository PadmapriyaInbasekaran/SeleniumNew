package com.atemcs.allinone.employeedb;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "empskills")
public class EmployeeSkills {

	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeOneToMany employee ;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "skillid")
	private int skillid;

	@Column(name = "skillname")
	private String skillname;


	public EmployeeSkills()
	{

	}
	public EmployeeSkills(String skillname)
	{

		this.skillname = skillname;
	}

	public String getSkillName() {
		return skillname;
	}
	public void setSkillName(String skillname) {
		this.skillname = skillname;
	}
	
	public EmployeeOneToMany getEmployee() {
		return employee;
	}
	
	public void setEmployee(EmployeeOneToMany employee) {
		this.employee = employee;
	}

}
