package com.sjsu.BO;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name ="APP_VENDOR_DETAILS")
public class AppVendorDetails {
	
	@Column(name = "COMPANY_NAME", nullable = false)
	private String companyName;
	
	@Column(name = "PHONE", nullable = false)
	private String phoneNumber;
	
	@Column(name = "ADDRESS", nullable = false)
	private String address;
	
	@Column(name = "COMPANY_SIZE", nullable = true)
	private String companySize;
	
	@Column(name = "COMPANY_WEBSITE", nullable = false)
	private String companyWebsite;
	
	@Column(name = "CONTACT_EMAIL", nullable = false)
	private String contactEmail;
	
	@Id
	@Column(name = "USERNAME", unique = true, nullable = false)
	private String userName;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "PROFILE_IMAGE", nullable = true)
	private Blob profileImage;
	
	@Transient
	private String confirmPassword;

//	@OneToMany(targetEntity=ApplicationDetails.class, mappedBy="appVendorUsername", fetch=FetchType.EAGER)
//	private List<ApplicationDetails> applicationDetails;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanySize() {
		return companySize;
	}

	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Blob getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(Blob profileImage) {
		this.profileImage = profileImage;
	}

	@Override
	public String toString() {
		return "AppVendorDetails [companyName=" + companyName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", companySize=" + companySize + ", companyWebsite="
				+ companyWebsite + ", contactEmail=" + contactEmail
				+ ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
