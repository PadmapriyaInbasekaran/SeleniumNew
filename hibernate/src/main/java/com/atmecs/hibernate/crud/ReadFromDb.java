package com.atmecs.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

import com.atmecs.hibernate.pojo.PojoClass;
@Test
public class ReadFromDb {
	public void readFromDb()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(PojoClass.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			session.beginTransaction();
			int id=1;
			PojoClass pojo = session.get(PojoClass.class, id);
			System.out.println(pojo.getName());
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}


	}
}
