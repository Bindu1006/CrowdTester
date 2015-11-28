package com.sjsu.dao;

import java.util.List;

import com.sjsu.BO.ApplicationDetails;
import com.sjsu.BO.TesterDetails;

public interface ITesterDao {

	String editTesterProfile(TesterDetails testerDetails);

	List<ApplicationDetails> retreiveTesterDetails(String userName);

}
