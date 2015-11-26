package com.sjsu.dao;

import com.sjsu.BO.LoginDetails;
import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.UserTypeBO;

public interface ILoginDao {

	void getUsers();

	UserTypeBO authenticateUser(LoginDetails loginDetails);
}
