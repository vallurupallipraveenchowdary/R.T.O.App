package com.praveen.service;





import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.praveen.domain.Owner;
import com.praveen.domain.OwnerAddress;
import com.praveen.domain.VehicleDetails;
import com.praveen.entity.OwnerAddressEntity;
import com.praveen.entity.OwnerEntity;
import com.praveen.entity.VehicleDetailsEntity;
import com.praveen.repository.OwnerAddressRepository;
import com.praveen.repository.OwnerDeatilsRepository;
import com.praveen.repository.VehicleDetailsRepository;



@Component
@Service
public  class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerDeatilsRepository ownerDtlsRepo;
	
	@Autowired
	private OwnerAddressRepository ownerAddressRepo;
	
	@Autowired
	private VehicleDetailsRepository vehicleDetailsRepo;
	
	@Override
	public OwnerEntity saveownerDetails(Owner owner) {
		//logic to insert data
		
		OwnerEntity entity = new OwnerEntity();
		
		// copy data from domain obj to entity obj
		
		BeanUtils.copyProperties(owner, entity);
		
		OwnerEntity ownerEntity =  ownerDtlsRepo.save(entity);
		return ownerEntity;
	}

	@Override
	public Integer saveownerAddress(OwnerAddress ownerAddress) {
		
		OwnerAddressEntity adrsEntity = new OwnerAddressEntity();
		
		BeanUtils.copyProperties(ownerAddress, adrsEntity);
		
		OwnerEntity ownerEntity=new OwnerEntity();
		ownerEntity.setOwnerId(ownerAddress.getOwnerId());
		adrsEntity.setOwner(ownerEntity);
		
		ownerAddressRepo.save(adrsEntity);
		
		return ownerAddress.getOwnerId();
		
		
			
	}
	
	@Override
	public Integer savevehicleDetails(VehicleDetails vehicledetails) {
		
		VehicleDetailsEntity vcldtlsentity = new VehicleDetailsEntity();
		
		BeanUtils.copyProperties(vehicledetails, vcldtlsentity);
		
		OwnerEntity ownerEntity = new OwnerEntity();
		ownerEntity.setOwnerId(vehicledetails.getOwnerId());
		
        vcldtlsentity.setOwner(ownerEntity);
		
		vehicleDetailsRepo.save(vcldtlsentity);
		
		return vehicledetails.getOwnerId();
		
	}

	@Override
	public Owner findOwnerByOwnerId(Integer ownerId) {
		
		Owner owner = new Owner();
		
		Optional<OwnerEntity> optional = ownerDtlsRepo.findById(ownerId);
		
		if(optional.isPresent()) {
			
			BeanUtils.copyProperties(optional.get(),owner);
		}
		
		return owner;
	}

	

	
	  @Override public OwnerAddress findOwnerAddressByOwnerID(Integer ownerId) {
	  OwnerAddress ownerAddress = new OwnerAddress();
	  
	  Optional<OwnerAddressEntity> optional = ownerAddressRepo.findById(ownerId);
	  
	  if(optional.isPresent()) {
	  
	  BeanUtils.copyProperties(optional.get(),ownerAddress); }
	  
	  return ownerAddress; }
	  
	  @Override public VehicleDetails findVehicleDetailsByOwnerID(Integer ownerId)
	  {
	  
	  VehicleDetails vehicledetails = new VehicleDetails();
	  
	  Optional<VehicleDetailsEntity> optional =
	  vehicleDetailsRepo.findById(ownerId);
	  
	  if(optional.isPresent()) {
	  
	  BeanUtils.copyProperties(optional.get(),vehicledetails); } return
	  vehicledetails; }
	 
	
	
	
	
	
}
