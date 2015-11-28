package com.sjsu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjsu.BO.AppVendorDetails;
import com.sjsu.BO.TesterDetails;
import com.sjsu.BO.UploadAppBO;
import com.sjsu.service.IUploadAppService;

@Controller
@RequestMapping("saveAppDetails")

public class UploadAppController {
	
	private IUploadAppService uploadAppService;
	
	public IUploadAppService getIUploadAppService()
	{
		return uploadAppService;
	}
	
	@Autowired
	public void setUploadAppService(IUploadAppService uploadAppService)
	{
		this.uploadAppService = uploadAppService;
	}
	
	@RequestMapping("/showAppSaveform")
	public String showProfileform(HttpServletRequest request,
			HttpServletResponse response, @ModelAttribute("uploadAppBO") UploadAppBO uploadAppBO, Model model){
		
		System.out.println("HI shib");
		String result = uploadAppService.saveAppDetails(uploadAppBO);
		System.out.println("HIiiiii");
		model.addAttribute("uploadAppBO", uploadAppBO);
		return "SuccessPage";
	}
	

	
	
}
