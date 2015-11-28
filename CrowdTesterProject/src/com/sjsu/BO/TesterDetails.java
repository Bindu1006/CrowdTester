package com.sjsu.BO;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import oracle.sql.BLOB;


@Entity
@Table(name ="Tester_Details")
public class TesterDetails {
	
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@Column(name = "LASTNAME", nullable = true)
	private String lastName;
	
	@Column(name = "AGE", nullable = true)
	private String age;
	
	@Column(name = "GENDER", nullable = true)
	private String gender;
	
	@Column(name = "ADDRESS", nullable = true)
	private String address;
	
	@Column(name = "PHONE_NUMBER", nullable = true)
	private String phoneNumber;
	
	@Column(name = "CONTACT_EMAIL", nullable = false) 
	private String email;
	
	@Column(name = "EDUCATION", nullable = false)
	private String education;
	
	@Column(name = "OCCUPATION", nullable = false)
	private String occupation;
	
	@Column(name = "PROFILE_IMAGE", nullable = true)
	private BLOB profileImage;
	
	@Id
	@Column(name = "USERNAME", unique = true, nullable = false)
	private String userName;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "PREFERRED_TEST_LANGUAGE", nullable = false)
	private String preferredTestLang;
	
	@Column(name = "EXPERIENCE", nullable = false)
	private String experience;
	
	@Column(name = "CREDITS", nullable = false)
	private String credit="1";
	
	@Column(name = "RANKING", nullable = false)
	private String ranking="1";
	
	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}


	@Transient
	private String confirmPassword;
	
	
	

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public BLOB getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(BLOB profileImage) {
		this.profileImage = profileImage;
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

	@Override
	public String toString() {
		return "TesterDetails [firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", education=" + education
				+ ", occupation=" + occupation + ", userName=" + userName + ", password="
				+ password + "]";
	}

	public String getPreferredTestLang() {
		return preferredTestLang;
	}

	public void setPreferredTestLang(String preferredTestLang) {
		this.preferredTestLang = preferredTestLang;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	

}
