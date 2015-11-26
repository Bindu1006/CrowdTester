package com.sjsu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.TesterDetails;
import com.sjsu.dao.IRegistrationDao;

@Component
public class RegistrationServiceImpl implements IRegistrationService {

	private IRegistrationDao registrationDao;
	
	public IRegistrationDao getRegistrationDao() {
		return registrationDao;
	}
	
	@Autowired
	public void setRegistrationDao(IRegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}

	@Override
	public String saveTesterDetails(TesterDetails testerDetails) {
		String result = registrationDao.saveTesterDetails(testerDetails);
		return result;
	}

	@Override
	public String saveAppVendorDetails(AppVendorDetails appVendorDetails) {
		String result = registrationDao.saveAppVendorDetails(appVendorDetails);
		return result;
	}

}
