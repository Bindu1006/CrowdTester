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

import com.sjsu.BO.TesterDetails;
@Component
public class TesterValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("hi bin2");
		TesterDetails testerDetails = (TesterDetails) target;
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "education", "education");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "experience", "experience");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "education", "education");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "occupation", "occupation");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "preferredTestLang", "preferredTestLang");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword","confirmPassword");
		
		
		/*final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +
				"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
				"(\\.[A-Za-z]{2,})$";

		Pattern pattern;
		Matcher matcher;
		 pattern = Pattern.compile(EMAIL_PATTERN);
		 
		 matcher = pattern.matcher(testerDetails.getEmail());
			if(!matcher.matches()){
					
				errors.rejectValue("email", "Pattern.appVendorDetails.email");
			}
		
			//String expression = "^(?=.{7,32}$)(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*((\\s?x\\s?|ext\\s?|extension\\s?)\\d{1,5}){0,1}$";  
			//pattern = Pattern.compile("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$");
			// pattern = Pattern.compile(expression);
			pattern = Pattern.compile("/^(\\+91-|\\+91|0|\\+)?\\d{10}$/");
		     matcher = pattern.matcher(testerDetails.getPhoneNumber());
		      
    		 
    	
    			if(!matcher.matches()){
    					
    				errors.rejectValue("phoneNumber", "Pattern.appVendorDetails.phoneNumber");
    			
    			}
		
		if (!testerDetails.getPassword().equals(testerDetails.getConfirmPassword())) {
			errors.rejectValue("confirmPassword", "Diff.appVendor.confirmPassword");
		}*/
		
				
	}

}
