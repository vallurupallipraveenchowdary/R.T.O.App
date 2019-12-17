package com.praveen.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praveen.constant.OwnerConstants;
import com.praveen.domain.Owner;
import com.praveen.entity.OwnerEntity;
import com.praveen.service.OwnerServiceImpl;


@Controller
public class OwnerController {
	
	@Autowired
	private OwnerServiceImpl ownerService;
	
	@RequestMapping(value="/displayForm")
	public String DisplayForm(Model model) {
		
		Owner owner = new Owner(); //pojo
		
		// sending data from controller to ui
		
		
		model.addAttribute("ownerObj", owner);
		
		return OwnerConstants.DISPLAY_FORM; //logical view name
	}
	@RequestMapping(value="/saveownerDetails", method=RequestMethod.POST)
	public String saveownerDetailsForm(@ModelAttribute("ownerObj") Owner owner, Model model) {
		
		
		
		OwnerEntity ownerEntity = ownerService.saveownerDetails(owner);
		
		Integer ownerId = ownerEntity.getOwnerId();
		return "redirect:/AddressForm?ownerId="+ownerId;
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
