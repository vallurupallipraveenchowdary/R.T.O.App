package com.praveen.service;

import java.util.List;

import com.praveen.domain.Owner;

 

public interface OwnerService {

	public boolean saveUserDetails(Owner user);
	
	public List<Owner> retriveAllUsers();
	
}
