package com.sjsu.BO;

	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name ="app_Details")
	public class UploadAppBO {
		
		@Id
		@Column(name = "APPLICATION_ID", nullable = false)
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private String applicationId;
		
		@Column(name = "App_Name", nullable = false)
		private String App_Name;
		
		@Column(name = "DESCRIPTION", nullable = false)
		private String Description;
		
		@Column(name = "Product_OS", nullable = false)
		private String Product_Os;
		
		@Column(name = "App_Size", nullable = true)
		private String App_Size;
		
		@Column(name = "APP_Language", nullable = true)
		private String APP_Language;
		
		@Column(name = "App_Provider", nullable = true)
		private String App_Provider;
		
		@Column(name = "App_Vendor_Details_UserName", nullable = false) 
		private String App_Vendor_Details_UserName;
		
		@Column(name = "Reporting_Language", nullable = false)
		private String Reporting_Language;
		
		@Column(name = "App_Document", nullable = false)
		private String  App_Document;
		
		@Column(name = "Download_Link", nullable = false)
		private String  Download_Link;
		
		@Column(name = "Test_Type", nullable = true)
		private String  Test_Type;
		
		@Column(name = "Test_DeadLine", nullable = true)
		private String  Test_DeadLine ="1" ;
		
		@Column(name = "Cost", nullable = false)
		public int cost = 0;
		
		public int cost() {
			return cost;
		}

		public void setcost(int cost) {
			this.cost = cost;
		}
		
		public String getApp_Name() {
			return App_Name;
		}

		public void setApp_Name(String App_Name) {
			this.App_Name = App_Name;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String Description) {
			this.Description = Description;
		}

		public String getProduct_Os() {
			return Product_Os;
		}

		public void setProduct_Os(String Product_Os) {
			this.Product_Os = Product_Os;
		}

		public String getApp_Size() {
			return App_Size;
		}

		public void setApp_Size(String App_Size) {
			this.App_Size = App_Size;
		}

		public String getAPP_Language() {
			return APP_Language;
		}

		public void setAPP_Language(String APP_Language) {
			this.APP_Language = APP_Language;
		}

		public String getApp_Provider() {
			return App_Provider;
		}

		public void setApp_Provider(String App_Provider) {
			this.App_Provider = App_Provider;
		}

		public String getApp_Vendor_Details_UserName() {
			return App_Vendor_Details_UserName;
		}

		public void setApp_Vendor_Details_UserName(String App_Vendor_Details_UserName) {
			this.App_Vendor_Details_UserName = App_Vendor_Details_UserName;
		}

		public String getReporting_Language() {
			return Reporting_Language;
		}

		public void setReporting_Language(String Reporting_Language) {
			this.Reporting_Language = Reporting_Language;
		}

		public String getApp_Document() {
			return App_Document;
		}

		public void setApp_Document(String App_Document) {
			this.App_Document = App_Document;
		}
		
		public String getDownload_Link() {
			return Download_Link;
		}

		public void setDownload_Link(String Download_Link) {
			this.Download_Link = Download_Link;
		}

		public String getTest_Type() {
			return Test_Type;
		}

		public void setTest_Type(String Test_Type) {
			this.Test_Type = Test_Type;
		}

		public String getTest_DeadLine() {
			return Test_DeadLine;
		}

		public void setTest_DeadLine(String Test_DeadLine) {
			this.Test_DeadLine = Test_DeadLine;
		}

		@Override
		public String toString() {
			return "AppDetails [cost=" + cost + ",App_Name " + App_Name + ",Description=" + Description + ", Product_Os="
					+ Product_Os + ", App_Size=" + App_Size + ", APP_Language=" + APP_Language
					+ ", App_Provider=" + App_Provider + ", App_Vendor_Details_UserName=" + App_Vendor_Details_UserName
					+ ", Reporting_Language=" + Reporting_Language + ", App_Document=" + App_Document
					+ ", Download_Link=" + Download_Link + ", Test_Type=" + Test_Type + ", Test_DeadLine="
					+ Test_DeadLine + "]";
		}
				
	}


