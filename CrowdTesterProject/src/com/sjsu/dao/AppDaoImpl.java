package com.sjsu.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.UploadAppBO;

@Repository
public class AppDaoImpl implements IAppDao{

	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	/*@Override
	public String saveAppProfile(UploadAppBO appDetails) {
		System.out.println("EDIT AND SAVE TESTER DETAILS ::: In DAO class..");
		Session session = getSessionFactory().getCurrentSession();
		String result = "SUCCESS";
		try {
		
		session.beginTransaction();
		
		session.saveOrUpdate(appDetails);
		session.getTransaction().commit();
	     } catch(Exception e) {
		System.out.println(e);
		session.getTransaction().rollback();
		result = "FAIL";
		return result;
	}
		return result;
	}*/

	//@Override
//	public String editTesterProfile(UploadAppBO uploadAppBO) {
		// TODO Auto-generated method stub
		//return null;
	//}

	
	@Override
	public String saveAppProfile(UploadAppBO uploadAppBO) {
		System.out.println("SAVE APP DETAILS ::: In DAO class..");
		Session session = getSessionFactory().getCurrentSession();
		String result = "SUCCESS";
		
		session.beginTransaction();
		
		session.save(uploadAppBO);
		session.getTransaction().commit();
		 /*catch(SQLException e) {
			System.out.println(e);
			session.getTransaction().rollback();
			result = "FAIL";
			return result;
		}*/
		return result;
	}
}
