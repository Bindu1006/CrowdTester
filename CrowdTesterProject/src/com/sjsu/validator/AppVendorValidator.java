package com.sjsu.validator;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.sjsu.BO.AppVendorDetails;;

@Component
public class AppVendorValidator implements Validator {

	
	
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("hi bin1");
    		AppVendorDetails appVendorDetails = (AppVendorDetails) target;
    		
    		/*ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    		Properties properties = new Properties();
    		try {
				properties.load(classLoader.getResourceAsStream("validation.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
    		/*ModelAndView mav= new ModelAndView();
    		mav.addAllObjects(((ModelAndView) errors).getModel());
    		*/
    		
    		System.out.println("hi bin");
    		
    	  //  String errorMessage = properties.getProperty("contactEmail");
    		
    	
    		/*
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", "NotEmpty");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "NotEmpty.appVendorDetails.phoneNumber");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty.appVendorDetails.address");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyWebsite", "NotEmpty.appVendorDetails.companyWebsite");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactEmail", "NotEmpty");
    		NotEmpty.appVendorDetails.contactEmail
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "NotEmpty.appVendorDetails.userName");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.appVendor.password");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword","NotEmpty.appVendorDetails.confirmPassword");
    		*/
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", "companyName");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "phoneNumber");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "address");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyWebsite", "companyWebsite");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactEmail", "contactEmail");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password");
    		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword","confirmPassword");
    		
    		
    		/*final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +
    				"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
    				"(\\.[A-Za-z]{2,})$";

    		Pattern pattern;
    		Matcher matcher;
    		 pattern = Pattern.compile(EMAIL_PATTERN);
    		 
    		 matcher = pattern.matcher(appVendorDetails.getContactEmail());
    			if(!matcher.matches()){
    					
    				errors.rejectValue("contactEmail", "Pattern.appVendorDetails.email");
    			}
    		
<<<<<<< HEAD
    			//String expression = "^(?=.{7,32}$)(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*((\\s?x\\s?|ext\\s?|extension\\s?)\\d{1,5}){0,1}$";  
    			   
    			 pattern = Pattern.compile("^[0-9]{10}$");
=======
    			//String expression = "^(?=.{7,32}$)(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*((\\s?x\\s?|ext\\s?|extension\\s?)\\d{1,5}){0,1}$";
    			//String expression = "^[2-9]{2}\d{8}";

    			pattern = Pattern.compile("/^(\\+91-|\\+91|0|\\+)?\\d{10}$/");
    			      
    			// pattern = Pattern.compile(expression);

>>>>>>> branch 'master' of https://github.com/shrutibidnur/CloudProjectRepo
    		     matcher = pattern.matcher(appVendorDetails.getPhoneNumber());
    		      
        		 
<<<<<<< HEAD
        		// = pattern.matcher(appVendorDetails.getContactEmail());
=======
        		// matcher = pattern.matcher(appVendorDetails.getContactEmail());
>>>>>>> branch 'master' of https://github.com/shrutibidnur/CloudProjectRepo
        			if(!matcher.matches()){
        					
        				errors.rejectValue("phoneNumber", "Pattern.appVendorDetails.phoneNumber");
        			
        			}
    		
    		if (!appVendorDetails.getPassword().equals(appVendorDetails.getConfirmPassword())) {
    			errors.rejectValue("confirmPassword", "Diff.appVendor.confirmPassword");
    		}*/
    		
    				
	}
	

}
