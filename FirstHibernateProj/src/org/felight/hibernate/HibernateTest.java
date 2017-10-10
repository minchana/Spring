package org.felight.hibernate;

import java.util.Date;
import java.util.List;

import org.felight.dto.Address;
import org.felight.dto.Employee;
import org.felight.dto.FourWheeler;
import org.felight.dto.TwoWheeler;
import org.felight.dto.UserDetails;
import org.felight.dto.Vehicle;
import org.felight.hibernate.utils.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory =  HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		for(int i=0;i<10;i++){
			Employee emp1 = new Employee();
			emp1.setName("Employee"+i);
			session.save(emp1);
		}
	
		Employee emp1= (Employee) session.get(Employee.class, 1);
		emp1.setName("Update the employee");
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		Employee emp2=(Employee) session2.get(Employee.class, 1);
		session2.getTransaction().commit();
		session2.close();


	}

}
