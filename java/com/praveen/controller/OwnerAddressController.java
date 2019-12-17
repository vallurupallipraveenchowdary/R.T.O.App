package com.praveen.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.praveen.domain.OwnerAddress;

import com.praveen.service.OwnerServiceImpl;

@Controller
public class OwnerAddressController {
	
	@Autowired
	private OwnerServiceImpl ownerServiceimpl;
	
	@RequestMapping(value="/AddressForm")
	public String AddressForm(HttpServletRequest request,Model model) {
		String ownerId = request.getParameter("ownerId");
		
		OwnerAddress vehicleOwner = new OwnerAddress(); //pojo
		
		vehicleOwner.setOwnerId(Integer.parseInt(ownerId));
		// sending data from controller to ui
		
		
		model.addAttribute("addressObj", vehicleOwner);
		
		return "owneraddressform"; //logical view name
	}
	@RequestMapping(value="/saveowneraddress", method = RequestMethod.POST)
	public String saveowneraddressForm(@ModelAttribute("addressObj") OwnerAddress ownerAddress, Model model) {
		
		Integer ownerId = ownerServiceimpl.saveownerAddress(ownerAddress);
		return "redirect:/VehicleDetailsForm?ownerId="+ownerId;
	}
}
	
	
	


