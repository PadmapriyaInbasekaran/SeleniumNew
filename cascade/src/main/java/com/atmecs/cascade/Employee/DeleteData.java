package com.atmecs.cascade.Employee;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

@Test
public class DeleteData {
	public void deleteData()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(EmployeeContact.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			Scanner sc = new Scanner(System.in);
		session.beginTransaction();
		System.out.println("Enter the userId you want to delete..");
		int userId = sc.nextInt();
		String query = "FROM EmployeeContact where Sno = '" + userId + "'" + "";
        @SuppressWarnings("unchecked")
		List<EmployeeContact> userList = session.createQuery(query).getResultList();
		for(EmployeeContact emp : userList)
		{
			session.delete(emp);
		}
			session.getTransaction().commit();
			sc.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		
		}
	}


}
