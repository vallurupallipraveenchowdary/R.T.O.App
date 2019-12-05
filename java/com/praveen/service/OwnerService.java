package com.praveen.service;

import java.util.List;

import com.praveen.domain.Owner;

 

public interface OwnerService {

	public boolean saveownerDetails(Owner owner);
	
	public List<Owner> retriveAllowners();
	
}
