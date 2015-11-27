package com.sjsu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.TestingDetails;

@Repository
public class TesterDaoImpl implements ITesterDao{

	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	
	@Override
	public String editTesterProfile(TesterDetails testerDetails) {
		System.out.println("EDIT AND SAVE TESTER DETAILS ::: In DAO class..");
		Session session = getSessionFactory().getCurrentSession();
		String result = "SUCCESS";
		try {
		
		session.beginTransaction();
		
		session.saveOrUpdate(testerDetails);
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
	public List<TestingDetails> retreiveTesterDetails(String userName) {
		Session session = getSessionFactory().getCurrentSession();
		List<TestingDetails> testerDetailsList = new ArrayList<TestingDetails>();
		System.out.println("IN AJAX DAO" + userName);
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(TestingDetails.class);
		Restrictions.eq("testerUserName",userName).ignoreCase();
        testerDetailsList = (List<TestingDetails>) criteria.list();
        System.out.println(testerDetailsList);
        session.getTransaction().commit();
		return testerDetailsList;
	}

}
