package com.sjsu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sjsu.BO.LoginDetails;
import com.sjsu.BO.UserTypeBO;
import com.sjsu.dao.ILoginDao;

@Component
public class LoginServiceImpl implements ILoginService {
	
	private ILoginDao loginDao;
	 
	public ILoginDao getPersonDao() {
	return loginDao;
	}
	 
	@Autowired
	public void setPersonDao(ILoginDao personDao) {
	this.loginDao = personDao;
	}
	
	@Override
	public void getTesterDetails() {
		System.out.println("In service class..");
		loginDao.getUsers();		
	}

	@Override
	public UserTypeBO authenticateUser(LoginDetails loginDetails) {
		UserTypeBO userTypeBO = loginDao.authenticateUser(loginDetails);
		return userTypeBO;
	}

}
