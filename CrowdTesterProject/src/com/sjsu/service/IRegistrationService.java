package com.sjsu.service;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.TesterDetails;

public interface IRegistrationService {
	
	String saveTesterDetails(TesterDetails testerDetails);

	String saveAppVendorDetails(AppVendorDetails appVendorDetails);

}
