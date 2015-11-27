package com.sjsu.service;

import java.util.List;

import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.TestingDetails;

public interface ITesterService {

	String editTesterProfile(TesterDetails testerDetails);

	List<TestingDetails> retreiveTesterDetails(String userName);

}
