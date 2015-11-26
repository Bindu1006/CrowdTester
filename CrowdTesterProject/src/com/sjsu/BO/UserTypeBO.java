package com.sjsu.BO;

public class UserTypeBO {
	
	private String userType;
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public AppVendorDetails getAppVendorDetails() {
		return appVendorDetails;
	}

	public void setAppVendorDetails(AppVendorDetails appVendorDetails) {
		this.appVendorDetails = appVendorDetails;
	}

	public TesterDetails getTesterDetails() {
		return testerDetails;
	}

	public void setTesterDetails(TesterDetails testerDetails) {
		this.testerDetails = testerDetails;
	}

	AppVendorDetails appVendorDetails;
	
	TesterDetails testerDetails;

}
