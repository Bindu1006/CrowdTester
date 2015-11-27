package com.sjsu.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sjsu.BO.LoginDetails;
import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.TestingDetails;
import com.sjsu.service.ILoginService;
import com.sjsu.service.ITesterService;

@Controller
@RequestMapping("tester")
public class TesterController {
	
	private ITesterService testerService;
	 
	public ITesterService getTesterService() {
		return testerService;
	}

	@Autowired
	public void setTesterService(ITesterService testerService) {
		this.testerService = testerService;
	}

	
	@RequestMapping("/showTesterDashboard")
	public String showTesterDashboard(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("testerDetails") TesterDetails testerDetails, Model model){
		System.out.println(testerDetails);
		HttpSession session = request.getSession();
		session.setAttribute("sessionTesterDetails", testerDetails);

		model.addAttribute("testerDetails", testerDetails);
		
		return "TesterDashboard";
	}
	
	@RequestMapping("/showProfileform")
	public String showProfileform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("testerDetails") TesterDetails testerDetails, Model model){
		System.out.println("HIiiiii");
		HttpSession session = request.getSession();
		testerDetails = (TesterDetails) session.getAttribute("sessionTesterDetails");
		System.out.println(testerDetails);
		model.addAttribute("testerDetails", testerDetails);
		return "TesterProfileForm";
	}
	
	@RequestMapping("/showBillingform")
	public String showBillingform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("testerDetails") TesterDetails testerDetails, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("testerDetails", testerDetails);
		return "TesterBillingForm";
	}
	
	@RequestMapping("/showAssistform")
	public String showAssistform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("testerDetails") TesterDetails testerDetails, Model model){
		System.out.println("HIiiiii");
		model.addAttribute("testerDetails", testerDetails);
		return "TesterAssistForm";
	}
	
	@RequestMapping("/editTesterProfile")
	public String editTesterProfile(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("testerDetails") TesterDetails testerDetails, Model model){
		System.out.println("Edit And Save TESTER Details :: METHODNAME :: editTesterProfile");
		HttpSession session = request.getSession();
		TesterDetails oldTesterDetails = (TesterDetails) session.getAttribute("sessionTesterDetails");
		oldTesterDetails.setFirstName(testerDetails.getFirstName());
		oldTesterDetails.setLastName(testerDetails.getLastName());
		oldTesterDetails.setAge(testerDetails.getAge());
		oldTesterDetails.setAddress(testerDetails.getAddress());
		if (testerDetails.getPhoneNumber() != null) {
			oldTesterDetails.setPhoneNumber(testerDetails.getPhoneNumber());
		}
		oldTesterDetails.setPassword(testerDetails.getPassword());
		oldTesterDetails.setEducation(testerDetails.getEducation());
		oldTesterDetails.setOccupation(testerDetails.getOccupation());
		System.out.println(oldTesterDetails);
		String result = testerService.editTesterProfile(oldTesterDetails);
		if (result.equalsIgnoreCase("SUCCESS")) {
			return "TesterProfileForm";
		}
		return "TesterAssistForm";
	}
	
	@RequestMapping("/ajaxShowTestDetails")
	public @ResponseBody JSONArray ajaxShowTestDetails(@RequestParam("userName") String userName){
		System.out.println("Entered Ajax Method ::: METHODNAME ::: ajaxShowTestDetails");
		System.out.println(userName);
		List<TestingDetails> testerDetailList = new ArrayList<TestingDetails>(); 
		testerDetailList = testerService.retreiveTesterDetails(userName); 
		
		// converting to JSON format from Java list 
		JSONObject responseDetailsJson = new JSONObject();
	    JSONArray jsonArray = new JSONArray();
	    
	    for(TestingDetails p : testerDetailList) {
	    	System.out.println(p.getTesterUserName()+ "   " +p.getCredits());
	    	JSONObject formDetailsJson = new JSONObject();
	        formDetailsJson.put("userName" , p.getTesterUserName());
	        formDetailsJson.put("credits", p.getCredits());
//	        formDetailsJson.put("email" , p.getEmail());
//	        formDetailsJson.put("phoneNumber", p.getPhoneNumber());
//	        formDetailsJson.put("occupation" , p.getOccupation());
//	        formDetailsJson.put("education", p.getEducation());
	        jsonArray.add(formDetailsJson);
	    }
	    
	    // Debug messages 
	    Iterator i = jsonArray.iterator();
	                // take each value from the json array separately
	         while (i.hasNext()) {
	             JSONObject innerObj = (JSONObject) i.next();
	              System.out.println(innerObj.get("userName"));
	                }

		return jsonArray;
		
	}

	
}
