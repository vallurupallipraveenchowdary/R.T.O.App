package com.praveen.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.praveen.domain.Owner;
import com.praveen.domain.OwnerAddress;
import com.praveen.domain.VehicleDetails;
import com.praveen.service.OwnerService;

@Controller
public class VehicleRegController {
	
	@Autowired
	private OwnerService ownerService;
	
	@GetMapping("/VehicleRegForm")
	public String displayVehicleRegForm(HttpServletRequest req, Model model) {
		
	String ownerId = req.getParameter("ownerId");
		
		// logic to retrive all 3 Tables Data and Send to View
		
	Owner owner =	ownerService.findOwnerByOwnerId(Integer.parseInt(ownerId));
		model.addAttribute("ownerObj", owner);
		
		OwnerAddress ownerAddress =	ownerService.findOwnerAddressByOwnerID(Integer.parseInt(ownerId));
		model.addAttribute("addressObj", ownerAddress);
		
		VehicleDetails vehicledetails =	ownerService.findVehicleDetailsByOwnerID(Integer.parseInt(ownerId));
		model.addAttribute("vehicledetailsObj", vehicledetails);
		
		
		
		model.addAttribute("OWNER_ID", ownerId);
		
		
		
		return "vehicleRegistrationForm";
	}
	
	@PostMapping("/registerVehicle")
	public String hadleConfirmBtn(HttpServletRequest req, Model model) {
		
		String ownerId = req.getParameter("ownerId");
		
		System.out.println("Owner Id :"+ ownerId);
		
		return "vehicleRegistrationForm";
		
	}

}
