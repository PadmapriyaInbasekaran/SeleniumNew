package com.atmecs.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

import com.atmecs.hibernate.pojo.PojoClass;
@Test
public class UpdateRecord {
	public void updateRecord()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(PojoClass.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			session.beginTransaction();
			int id = 2;
			PojoClass pojo = session.get(PojoClass.class, id);
			pojo.setEmail("abcdef@gmail.com");
			session.update(pojo);
			System.out.println(pojo.getEmail());
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}


	}
}
