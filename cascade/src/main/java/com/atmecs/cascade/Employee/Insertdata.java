package com.atmecs.cascade.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;
public class Insertdata {
	static SessionFactory sessionFactoryObj;
	@Test
	public void insertData()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(EmployeeContact.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
		   	EmployeeContact empContact = new EmployeeContact();
			empContact.setAddress("Kochin,Kerala");
			empContact.setEmail("email@gmail.com");
			empContact.setPhNumber(1234567);
			empContact.setEmployee(new Employee("Raj",50000));
			session.beginTransaction();
			session.save(empContact);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
