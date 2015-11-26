package com.sjsu.service;

import com.sjsu.BO.LoginDetails;
import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.UserTypeBO;

public interface ILoginService {

	void getTesterDetails();

	UserTypeBO authenticateUser(LoginDetails loginDetails);
}
