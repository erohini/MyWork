package com.conflux.app.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.conflux.app.entity.Product;

@Component("producDAO")
public class ProductDAO implements IProductDAO{
	
	private SessionFactory sessionFactory;	

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,timeout=100, rollbackFor=SQLException.class)
	public void addProduct(Product product) {
		
//getCurrentSession is used to make sure that session is called which is exactly used by the framework
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	 public void getProduct(){
		 
	 }
	
	
	
}
