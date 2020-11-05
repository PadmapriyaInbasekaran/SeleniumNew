package com.atmecs.onetomany.empdetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

public class InsertData {
	static SessionFactory sessionFactoryObj;
	@Test
	public void insertData()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(EmployeeDept.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			session.beginTransaction();
			EmployeeDept empdept = new EmployeeDept("IT");
			session.save(empdept);
			Employee employee1 = new Employee("PQR",45688);
			employee1.setEmployeedept(empdept);
			Employee employee2 = new Employee("MNP",76543);
			employee2.setEmployeedept(empdept);
			session.save(employee1);
			session.save(employee2);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
