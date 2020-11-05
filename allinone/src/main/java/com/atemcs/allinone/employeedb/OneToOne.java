package com.atemcs.allinone.employeedb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;
public class OneToOne {
	static SessionFactory sessionFactoryObj;
	@Test
	public void insertData()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeOneToOne.class).addAnnotatedClass(EmployeeDetails.class);
		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			EmployeeDetails empDetails = new EmployeeDetails();
			empDetails.setAddress("Kochin,Kerala");
			empDetails.setYoe(4);
			empDetails.setPhNo(81234567);
			empDetails.setSalary(13000);
			empDetails.setEmployee(new EmployeeOneToOne("Ajju","ajju@gmail.com"));
			session.beginTransaction();
			session.save(empDetails);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}

