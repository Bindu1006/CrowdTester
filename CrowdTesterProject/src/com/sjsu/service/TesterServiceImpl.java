package com.sjsu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sjsu.BO.TesterDetails;
import com.sjsu.dao.ILoginDao;
import com.sjsu.dao.ITesterDao;

@Component
public class TesterServiceImpl implements ITesterService{

	private ITesterDao testerDao;
	
	public ITesterDao getTesterDao() {
		return testerDao;
	}

	@Autowired
	public void setTesterDao(ITesterDao testerDao) {
		this.testerDao = testerDao;
	}

	@Override
	public String editTesterProfile(TesterDetails testerDetails) {
		String result = testerDao.editTesterProfile(testerDetails);
		return result;
	}

}
