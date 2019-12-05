package com.praveen.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praveen.domain.Owner;
import com.praveen.service.OwnerService;


@Controller
public class OwnerController {
	
	@Autowired
	private OwnerService ownerservice;
	
	@RequestMapping(value="/displayForm")
	public String DisplayownerForm(Model model) {
		
		Owner owner = new Owner(); //pojo
		
		// sending data from controller to ui
		
		model.addAttribute("ownerObj", owner);
		
		return "index"; //logical view name
	}
	@RequestMapping(value="/saveowner", method = RequestMethod.POST)
	public String handlesubmitBtn(@ModelAttribute("ownerObj") Owner owner, Model model) {
		
		System.out.println(owner);
		
		boolean isSaved = ownerservice.saveownerDetails(owner);
		if(isSaved) {
			model.addAttribute("succMsg", "Record saved sucessfully");
		}else {
			model.addAttribute("errMsg", "Record is not Saved");
		}
		
		model.addAttribute("owner",owner);
		
		return "index";
	}
}
	
/*
 * @RequestMapping("/viewowners") public String viewowners(Model model) {
 * 
 * List<Owner> ownersList = ownerservice.retriveAllowners();
 * 
 * // send data from controller data to presentation layer
 * 
 * model.addAttribute("owners",ownersList);
 * 
 * return "owners"; }
 * 
 * }
 */
