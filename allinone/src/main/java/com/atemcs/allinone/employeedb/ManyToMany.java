package com.atemcs.allinone.employeedb;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;
public class ManyToMany {
	static SessionFactory sessionFactoryObj;
	
	@Test
	public void insertData()
	{
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeManyToMany.class).addAnnotatedClass(EmployeeProject.class);
		SessionFactory sf = configObj.buildSessionFactory();
		Session session = sf.getCurrentSession();
		try
		{
			session.beginTransaction();
			EmployeeProject empProject1 = new EmployeeProject("Projecttwo");
			EmployeeProject empProject2 = new EmployeeProject("Projectthree");
			EmployeeProject empProject3 = new EmployeeProject("Projectfour");
			Set<EmployeeProject> emppro = new HashSet<EmployeeProject>();
			emppro.add(empProject1);
			emppro.add(empProject2);
			emppro.add(empProject3);
		
			EmployeeManyToMany emp1 = new EmployeeManyToMany("Harish","harish@gmail.com");
			EmployeeManyToMany emp2 = new EmployeeManyToMany("Aadhi","aadhi@gmail.com");
			Set<EmployeeManyToMany> emp = new HashSet<EmployeeManyToMany>();
		    emp.add(emp1);
            emp.add(emp2);
         
            emp1.setProject(emppro);
            emp2.setProject(emppro);
			session.save(emp1);
			session.save(emp2);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}





















//emp1.getProject().add(empProject1);
//emp1.getProject().add(empProject3);
//session.save(emp1);


//emp2.getProject().add(empProject2);
//emp2.getProject().add(empProject3);
//session.save(emp2);