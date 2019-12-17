package com.praveen.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.praveen.domain.VehicleDetails;

import com.praveen.service.OwnerServiceImpl;

@Controller
public class VehicleDetailsController {

	
	
	@Autowired	
private OwnerServiceImpl ownerServiceImpl;
	
	@RequestMapping(value="/VehicleDetailsForm", method=RequestMethod.GET)
	public String VehicleDetailsForm(HttpServletRequest request,Model model) {
		String ownerId = request.getParameter("ownerId");
		VehicleDetails vehicledetails = new VehicleDetails(); //pojo
		
		// sending data from controller to ui
		
		vehicledetails.setOwnerId(Integer.parseInt(ownerId));
		
		model.addAttribute("vehicledetailsObj", vehicledetails);
		
		return "vehicledetailsform"; //logical view name
	}
	@RequestMapping(value="/savevehicleDetails", method = RequestMethod.POST)
	private String savevehicleDetails(@ModelAttribute("vehicledetailsObj") VehicleDetails vehicledetails, Model model) {
		
		Integer ownerId = ownerServiceImpl.savevehicleDetails(vehicledetails);
		
		return "redirect:/VehicleRegForm?ownerId="+ownerId;
		
	}
}
