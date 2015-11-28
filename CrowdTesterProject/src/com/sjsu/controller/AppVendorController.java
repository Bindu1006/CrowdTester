package com.sjsu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjsu.BO.AppVendorDetails;

import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.UploadAppBO;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.service.IAppVendorService;


@Controller
@RequestMapping("appVendor")
public class AppVendorController {
	
	private IAppVendorService appVendorService;
	
	public IAppVendorService getAppVendorService() {
		return appVendorService;
	}

	@Autowired
	public void setAppVendorService(IAppVendorService appVendorService) {
		this.appVendorService = appVendorService;
	}
	
	@RequestMapping("/showAppVendorDashboard")
	public String showAppVendorDashboard(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		
		HttpSession session = request.getSession();
		session.setAttribute("sessionAppVendorDetails", appVendorDetails);
		model.addAttribute("appVendorDetails", appVendorDetails);
		
		return "AppVendorDashboard";
	}
	
	@RequestMapping("/showAppVendorProfileform")
	public String showProfileform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		System.out.println("HIiiiii");
		HttpSession session = request.getSession();
		appVendorDetails = (AppVendorDetails) session.getAttribute("sessionAppVendorDetails");
		System.out.println("profile"+appVendorDetails);
		
		
		model.addAttribute("appVendorDetails", appVendorDetails);
		return "AppVendorProfileForm";
	}
	
	
	@RequestMapping("/showAppVendorAssistform")
	public String showAssistform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("appVendorDetails", appVendorDetails);
		return "AppVendorAssistForm";
	}
	

	@RequestMapping("/showUploadAppForm.do")
	public String showBillingform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("uploadAppBO") UploadAppBO UploadAppBO, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("UploadAppBO", UploadAppBO);
		return "UploadAppForm";
	}
	@RequestMapping("/editAppVendorProfile")
	public String editAppVendorProfile(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		System.out.println("Edit And Save App Vendor Details :: METHODNAME :: editAppVendorProfile");
		HttpSession session = request.getSession();
		AppVendorDetails oldAppVendorDetails = (AppVendorDetails) session.getAttribute("sessionAppVendorDetails");
		oldAppVendorDetails.setCompanyName(appVendorDetails.getCompanyName());
		oldAppVendorDetails.setContactEmail(appVendorDetails.getContactEmail());
		//oldAppVendorDetails.setAge(appVendorDetails.getPhoneNumber());
		oldAppVendorDetails.setAddress(appVendorDetails.getCompanyWebsite());
		if (appVendorDetails.getPhoneNumber() != null) {
			oldAppVendorDetails.setPhoneNumber(appVendorDetails.getPhoneNumber());
		}
		oldAppVendorDetails.setPassword(appVendorDetails.getPassword());
		System.out.println(oldAppVendorDetails);
		String result = appVendorService.editAppVendorProfile(oldAppVendorDetails);
		if (result.equalsIgnoreCase("SUCCESS")) {
			return "AppVendorProfileForm";
		}
		return "AppVendorAssistForm";

	}
	
}
