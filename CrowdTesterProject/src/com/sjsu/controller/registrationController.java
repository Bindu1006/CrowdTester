package com.sjsu.controller;

import javax.servlet.http.HttpServletRequest;

//import org.springframework.validation.annotation.Validated;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.TesterDetails;
import com.sjsu.service.IRegistrationService;
import com.sjsu.validator.AppVendorValidator;
import com.sjsu.validator.TesterValidator;
@Controller
@RequestMapping("register")
public class registrationController {
	
	private IRegistrationService registrationService;
	
	public IRegistrationService getRegistrationService() {
		return registrationService;
	}

	@Autowired
	public void setRegistrationService(IRegistrationService registrationService) {
		this.registrationService = registrationService;
	}
	 
	private AppVendorValidator userValidator;
	private TesterValidator testerValidator;

	public AppVendorValidator getUserValidator() {
		return userValidator;
	}

	@Autowired
	public void setUserValidator(AppVendorValidator userValidator) {
		this.userValidator = userValidator;
	}
	
	public TesterValidator getTesterValidator() {
		return testerValidator;
	}

	@Autowired
	public void setTesterValidator(TesterValidator testerValidator) {
		this.testerValidator = testerValidator;
	}

	@RequestMapping("/showTesterRegistration")
	public String showTesterRegistration(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("testerDetails") TesterDetails testerDetails, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("testerDetails", testerDetails);
		return "TesterRegistrationPage";
	}
	
	@RequestMapping("/showAppProviderRegistration")
	public String showAppProviderRegistration(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") AppVendorDetails appVendorDetails, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("appVendorDetails", appVendorDetails);
		return "AppProviderRegistrationPage";
	}
	
	@RequestMapping("/registerTester")
	public String registerTester(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("testerDetails") @Valid TesterDetails testerDetails,BindingResult result, Model model){
ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("hi bindu1");
		testerValidator.validate(testerDetails, result);
       //System.out.println("bin"+result.getFieldValue("email"));
        if (result.hasErrors()){
        	
        	
        	return "TesterRegistrationPage";
        }
        else {
		
		System.out.println(testerDetails );
		String result1 = registrationService.saveTesterDetails(testerDetails);
		System.out.println("REGISTER TESTER::::" +result1);
		return "SuccessPage";
	}
}
	
	@RequestMapping("/registerAppProvider")
	public String registerTester(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("appVendorDetails") @Valid AppVendorDetails appVendorDetails,BindingResult result,
			Model model){
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("hi bindu");
       userValidator.validate(appVendorDetails, result);
       System.out.println("bin"+result.getFieldValue("contactEmail"));
        if (result.hasErrors()){
        	
        	
        	return "AppProviderRegistrationPage";
        }
        else {
		System.out.println(appVendorDetails );
		String result1 = registrationService.saveAppVendorDetails(appVendorDetails);
		System.out.println("REGISTER TESTER::::" +result1);
		
		return "SuccessPage";
	}
	}

}
