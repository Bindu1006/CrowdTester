//package com.sjsu.BO;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name ="Testing_Details")
//public class TestingDetails {
//	
//	@Column(name = "HOURS_TESTED", nullable = false)
//	private String hoursTested;
//	
//	@Column(name = "CREDITS", nullable = false)
//	private String credits;
//	
//	@Column(name = "RANKING", nullable = false)
//	private String ranking;
//	
////	@Id
////	@ManyToOne
////	@Column(name = "APP_DETAILS_APPLICATION_ID", nullable = false)
////	@JoinColumn(name = "userName")
////	private ApplicationDetails applicationId;
//	
//	@Id
//	@Column(name = "APP_DETAILS_APPLICATION_ID", nullable = false)
//	private String applicationId;
//	
//	@ManyToOne
//	@JoinColumn(name = "USERNAME")
//	private TesterDetails testerUserName;
//	
//
//	public String getHoursTested() {
//		return hoursTested;
//	}
//
//	public void setHoursTested(String hoursTested) {
//		this.hoursTested = hoursTested;
//	}
//
//	public String getCredits() {
//		return credits;
//	}
//
//	public void setCredits(String credits) {
//		this.credits = credits;
//	}
//
//	public String getRanking() {
//		return ranking;
//	}
//
//	public void setRanking(String ranking) {
//		this.ranking = ranking;
//	}
//
////	public ApplicationDetails getApplicationId() {
////		return applicationId;
////	}
////
////	public void setApplicationId(ApplicationDetails applicationId) {
////		this.applicationId = applicationId;
////	}
//
//	public TesterDetails getTesterUserName() {
//		return testerUserName;
//	}
//
//	public void setTesterUserName(TesterDetails testerUserName) {
//		this.testerUserName = testerUserName;
//	}
//
//	@Override
//	public String toString() {
//		return "TestingDetails [hoursTested=" + hoursTested + ", credits="
//				+ credits + ", ranking=" + ranking + ", applicationId="
//				+ applicationId + ", testerUserName=" + testerUserName + "]";
//	}
//	
//	
//}
