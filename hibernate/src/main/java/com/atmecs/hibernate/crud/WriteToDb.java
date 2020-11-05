package com.atmecs.hibernate.crud;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

import com.atmecs.hibernate.pojo.PojoClass;
@Test

public class WriteToDb {
	static SessionFactory sessionFactoryObj;
	public void writeToDb()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(PojoClass.class);

		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			session.beginTransaction();
			PojoClass emp = new PojoClass(2,"abc","abcderghbv@gmail.com",985475674);
			session.save(emp);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}

	}
}

