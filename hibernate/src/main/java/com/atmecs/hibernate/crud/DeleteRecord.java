package com.atmecs.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

import com.atmecs.hibernate.pojo.PojoClass;
@Test
public class DeleteRecord {
public void deleteRecord()
{
	Configuration configObj = new Configuration();
	configObj.configure("hibernate.cfg.xml").addAnnotatedClass(PojoClass.class);

	SessionFactory sf = configObj.buildSessionFactory();
	Session session = sf.getCurrentSession();
	try
	{
		session.beginTransaction();
	//	int id = 2;
		PojoClass pojo = new PojoClass();
		pojo.setSno(2);
		session.delete(pojo);
		System.out.println("Record Deleted...");
		session.getTransaction().commit();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		session.close();
	}


}	

}
