package com.praveen.service;



import org.springframework.stereotype.Component;

import com.praveen.domain.Owner;
import com.praveen.domain.OwnerAddress;
import com.praveen.domain.VehicleDetails;
import com.praveen.entity.OwnerEntity;

 
@Component
public interface OwnerService {

	public OwnerEntity saveownerDetails(Owner owner);
	
	
	public Integer saveownerAddress(OwnerAddress owneraddress);
	
	
	
	public Integer savevehicleDetails(VehicleDetails vehicledetails);
	
	public Owner findOwnerByOwnerId(Integer ownerId);
	
	
	public OwnerAddress findOwnerAddressByOwnerID(Integer ownerId);
	
	
	public VehicleDetails findVehicleDetailsByOwnerID(Integer ownerId);

	
	
}