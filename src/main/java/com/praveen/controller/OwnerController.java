package com.praveen.controller;

import java.util.List;

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
	private OwnerService userservice;
	
	@RequestMapping(value="/displayForm")
	public String DisplayUserForm(Model model) {
		
		Owner user = new Owner(); //pojo
		
		// sending data from controller to ui
		
		model.addAttribute("userObj", user);
		
		return "index"; //logical view name
	}
	@RequestMapping(value="/saveUser", method = RequestMethod.POST)
	public String handlesubmitBtn(@ModelAttribute("userObj") Owner user, Model model) {
		
		System.out.println(user);
		
		boolean isSaved = userservice.saveUserDetails(user);
		if(isSaved) {
			model.addAttribute("succMsg", "Record saved sucessfully");
		}else {
			model.addAttribute("errMsg", "Record is not Saved");
		}
		
		model.addAttribute("user",user);
		
		return "index";
	}
	
	@RequestMapping("/viewUsers")
	public String viewUsers(Model model) {
		
		List<Owner> usersList = userservice.retriveAllUsers();
		
		// send data from controller data to presentation layer
		
		model.addAttribute("users",usersList);
		
		return "Users";
	}

}
