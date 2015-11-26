package com.sjsu.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.LoginDetails;
import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.UserTypeBO;

@Repository
public class LoginDaoImpl implements ILoginDao{

	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void getUsers() {
		System.out.println("In DAO class..");
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(TesterDetails.class);
		List<TesterDetails> testerDetails = (List<TesterDetails>) criteria.list();
		session.getTransaction().commit();
		System.out.println("Tester Details:  " + testerDetails);
		
	}

	@Override
	public UserTypeBO authenticateUser(LoginDetails loginDetails) {
		System.out.println("In DAO class ::: Tester Authentication..");
		UserTypeBO userTypeBO = new UserTypeBO();
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(TesterDetails.class);
		Criterion username = Restrictions.eq("userName",loginDetails.getUserName()).ignoreCase();
        Criterion password = Restrictions.eq("password",loginDetails.getPassword());
        LogicalExpression Exp = Restrictions.and(username,password);
        criteria.add(Exp);
        TesterDetails loggedTesterDetails = (TesterDetails) criteria.uniqueResult();
        session.getTransaction().commit();
        if (loggedTesterDetails == null) {
        	System.out.println("Nulllll");
        	return aunthenticateAppProvider(loginDetails);
        }
        userTypeBO.setUserType("TESTER");
        userTypeBO.setTesterDetails(loggedTesterDetails);
		return userTypeBO;
	}

	private UserTypeBO aunthenticateAppProvider(LoginDetails loginDetails) {
		System.out.println("In DAO class ::: App Provider Authentication..");
		UserTypeBO userTypeBO = new UserTypeBO();
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(AppVendorDetails.class);
		Criterion username = Restrictions.eq("userName",loginDetails.getUserName()).ignoreCase();
        Criterion password = Restrictions.eq("password",loginDetails.getPassword());
        LogicalExpression Exp = Restrictions.and(username,password);
        criteria.add(Exp);
        AppVendorDetails appVendorDetails = (AppVendorDetails) criteria.uniqueResult();
        session.getTransaction().commit();
        if (appVendorDetails == null) {
        	System.out.println("Nulllll");
        	userTypeBO.setUserType("NONE");
        	return userTypeBO;
        } 
        userTypeBO.setUserType("APPVENDOR");
        userTypeBO.setAppVendorDetails(appVendorDetails);
        return userTypeBO;
	}

}
