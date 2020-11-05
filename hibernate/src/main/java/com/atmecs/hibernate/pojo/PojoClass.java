package com.atmecs.hibernate.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "testtable")

public class PojoClass {

	public PojoClass(int sno, String name, String email,int phonenumber) {
		this.sno = sno;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public PojoClass()
	{
		
	}
	
		@Id
		@Column(name = "Sno")
		private int sno;

		@Column(name = "Name")
		private String name;

		@Column(name = "Email")
		private String email;

		@Column(name = "PhoneNumber")
		private int phonenumber;


		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
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
		public int getPhoneNumber() {
			return phonenumber;
		}
		public void setPhoneNumber(int phonenumber) {
			this.phonenumber = phonenumber;
		}
	}
