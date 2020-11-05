package com.atmecs.cascade.Employee;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;
public class UpdateData {
	@Test
	public void readData()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(EmployeeContact.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			Scanner sc = new Scanner(System.in);
			session.beginTransaction();
			System.out.println("Enter the userId you want to update..");
			int userId = sc.nextInt();
			System.out.println("Enter the salary you want to update..");
			int phNum = sc.nextInt();
			String query = "UPDATE EmployeeContact SET PhNumber = '" + phNum + "' where Sno = '" + userId + "'" + "";
			session.createQuery(query).executeUpdate();
			session.getTransaction().commit();
			sc.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

}
