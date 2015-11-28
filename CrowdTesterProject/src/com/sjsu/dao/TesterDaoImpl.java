package com.sjsu.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjsu.BO.ApplicationDetails;
import com.sjsu.BO.TesterDetails;

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
	public List<ApplicationDetails> retreiveTesterDetails(String userName) {
		Session session = getSessionFactory().getCurrentSession();
		List<ApplicationDetails> applicationDetailsList = new ArrayList<ApplicationDetails>();
		System.out.println("IN AJAX DAO" + userName);
		session.beginTransaction();
		Query query = session.createSQLQuery(
				"select mapping.APPLICATION_ID from MAPPING_TESTER_APP mapping where mapping.TESTER_USERNAME = :userName")
				.setParameter("userName",userName);
				List appList = query.list();
				System.out.println(appList);
		Criteria criteria = session.createCriteria(ApplicationDetails.class);

		Disjunction disjunction = Restrictions.disjunction();
		Iterator<String> iterator = appList.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			disjunction.add(Restrictions.eq("applicationID",iterator.next()));
		}
		criteria.add(disjunction);
        applicationDetailsList = (List<ApplicationDetails>) criteria.list();
        System.out.println(applicationDetailsList);
        session.getTransaction().commit();
		return applicationDetailsList;
	}

}
