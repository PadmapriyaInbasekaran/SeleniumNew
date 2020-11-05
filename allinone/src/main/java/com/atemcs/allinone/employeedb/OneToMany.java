package com.atemcs.allinone.employeedb;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;
public class OneToMany {
	static SessionFactory sessionFactoryObj;
	@Test
	public void insertData()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeOneToMany.class).addAnnotatedClass(EmployeeSkills.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			session.beginTransaction();
			EmployeeOneToMany emp = new EmployeeOneToMany("PQR","pqr@gmail.com");
			session.save(emp);
			EmployeeSkills employeeskill1 = new EmployeeSkills("Coding");
			EmployeeSkills employeeskill2 = new EmployeeSkills("AppDevelopment");
			employeeskill1.setEmployee(emp);
			employeeskill2.setEmployee(emp);
			session.save(employeeskill1);
			session.save(employeeskill2);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
