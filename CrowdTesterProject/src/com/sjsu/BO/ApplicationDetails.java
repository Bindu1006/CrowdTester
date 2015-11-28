package com.sjsu.BO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="APP_Details")
public class ApplicationDetails {
	
	@Id
	@Column(name = "APPLICATION_ID", nullable = false)
	private String applicationID;
	
	@Column(name = "APP_NAME", nullable = false)
	private String appName;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	@Column(name = "TEST_TYPE", nullable = false)
	private String testType;
	
	@Column(name = "PRODUCT_OS", nullable = false)
	private String productOS;
	
	@Column(name = "TESTING", nullable = false)
	private String testing;
	
	@Column(name = "TEST_DEADLINE", nullable = false)
	private String testDeadLine;
	
	@Column(name = "DOWNLOAD_LINK", nullable = false)
	private String downloadLink;
	
	@Column(name = "APP_SIZE", nullable = false)
	private String appSize;
	
	@Column(name = "APP_DOCUMENT", nullable = false)
	private String appDocument;
	
//	@Column(name = "APP_PROVIDER", nullable = false)
//	private String appProvider;
	
	//@Column(name = "APP_VENDOR_DETAILS_USERNAME", nullable = false)
	@Column(name = "APP_VENDOR_DETAILS_USERNAME")
	private String appVendorUsername;
	
	@Column(name = "APP_LANGUAGE", nullable = false)
	private String appLanguage;
	
	@Column(name = "REPORTING_LANGUAGE", nullable = false)
	private String reportingLanguage;
	
	@Column(name = "COST", nullable = false)
	private String cost;

	public String getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getProductOS() {
		return productOS;
	}

	public void setProductOS(String productOS) {
		this.productOS = productOS;
	}

	public String getTesting() {
		return testing;
	}

	public void setTesting(String testing) {
		this.testing = testing;
	}

	public String getTestDeadLine() {
		return testDeadLine;
	}

	public void setTestDeadLine(String testDeadLine) {
		this.testDeadLine = testDeadLine;
	}

	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public String getAppSize() {
		return appSize;
	}

	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}

	public String getAppDocument() {
		return appDocument;
	}

	public void setAppDocument(String appDocument) {
		this.appDocument = appDocument;
	}

//	public String getAppProvider() {
//		return appProvider;
//	}
//
//	public void setAppProvider(String appProvider) {
//		this.appProvider = appProvider;
//	}

	public String getAppVendorUsername() {
		return appVendorUsername;
	}

	public void setAppVendorUsername(String appVendorUsername) {
		this.appVendorUsername = appVendorUsername;
	}

	public String getAppLanguage() {
		return appLanguage;
	}

	public void setAppLanguage(String appLanguage) {
		this.appLanguage = appLanguage;
	}

	public String getReportingLanguage() {
		return reportingLanguage;
	}

	public void setReportingLanguage(String reportingLanguage) {
		this.reportingLanguage = reportingLanguage;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ApplicationDetails [applicationID=" + applicationID
				+ ", appName=" + appName + ", description=" + description
				+ ", testType=" + testType + ", productOS=" + productOS
				+ ", testing=" + testing + ", testDeadLine=" + testDeadLine
				+ ", downloadLink=" + downloadLink + ", appSize=" + appSize
				+ ", appDocument=" + appDocument
				+ ", appVendorUsername=" + appVendorUsername
				+ ", appLanguage=" + appLanguage + ", reportingLanguage="
				+ reportingLanguage + ", cost=" + cost + "]";
	}
	
	

}
