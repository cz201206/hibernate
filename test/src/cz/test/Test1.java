package cz.test;

import java.util.Date;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cz.pojo.Person;

public class Test1 {
	@Test
	public void saveOrPersist(){
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Person p = new Person("cz", "12345678", new Date());
		session.persist(p);
		
		tx.commit();
		
		session.close();
		factory.close();
		
	}
	@Test
	public void loadOrGet(){
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Person p = (Person)session.load(Person.class, 2);
		System.out.println(p+"");
		
		session.close();
	}
}
