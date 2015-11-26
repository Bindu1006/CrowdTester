package com.sjsu.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.TesterDetails;

@Repository
public class RegistrationDaoImpl implements IRegistrationDao {

	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public String saveTesterDetails(TesterDetails testerDetails) {
		System.out.println("SAVE TESTER DETAILS ::: In DAO class..");
		Session session = getSessionFactory().getCurrentSession();
		String result = "SUCCESS";
		try {
		session.beginTransaction();
		
		session.save(testerDetails);
		session.getTransaction().commit();
		} catch(Exception e) {
			System.out.println(e);
			session.getTransaction().rollback();
			result = "FAIL";
			return result;
		}
		return result;
	}

	@Override
	public String saveAppVendorDetails(AppVendorDetails appVendorDetails) {
		System.out.println("SAVE APP PROVIDER DETAILS ::: In DAO class..");
		Session session = getSessionFactory().getCurrentSession();
		String result = "SUCCESS";
		try {
		session.beginTransaction();
		
		session.save(appVendorDetails);
		session.getTransaction().commit();
		} catch(Exception e) {
			System.out.println(e);
			session.getTransaction().rollback();
			result = "FAIL";
			return result;
		}
		return result;
	}

}
