package com.srg.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.srg.entities.ProductEntity;
import com.srg.utils.HibernateUtil;

public class ProductRepository {
	
	public void save(ProductEntity product) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		session.close();

	}
}
