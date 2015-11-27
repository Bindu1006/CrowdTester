package com.sjsu.dao;

import java.util.List;

import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.TestingDetails;

public interface ITesterDao {

	String editTesterProfile(TesterDetails testerDetails);

	List<TestingDetails> retreiveTesterDetails(String userName);

}
