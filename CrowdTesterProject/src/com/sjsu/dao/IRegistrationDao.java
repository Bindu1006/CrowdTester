package com.sjsu.dao;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.TesterDetails;

public interface IRegistrationDao {

	String saveTesterDetails(TesterDetails testerDetails);

	String saveAppVendorDetails(AppVendorDetails appVendorDetails);
}
