package com.praveen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.praveen.domain.Owner;
import com.praveen.entity.OwnerEntity;
import com.praveen.repository.OwnerDeatilsRepository;

@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerDeatilsRepository ownerDtlsRepo;
	
	@Override
	public boolean saveownerDetails(Owner owner) {
		//logic to insert data
		
		OwnerEntity entity = new OwnerEntity();
		
		// copy data from domain obj to entity obj
		
		BeanUtils.copyProperties(owner, entity);
		
		OwnerEntity savedEntity =  ownerDtlsRepo.save(entity);
		return savedEntity.getownerid() > 0;
	}

	@Override
	public List<Owner> retriveAllowners() {
		//logic to retrive records
		
		List<Owner> ownersList = new ArrayList<Owner>();
		
		PageRequest pageRequest = PageRequest.of(0,5);
		
	Page<OwnerEntity> findAll =	ownerDtlsRepo.findAll(pageRequest);
	
	List<OwnerEntity> ownerEntities = findAll.getContent();
	
	//List<ownerEntity> ownerEntities =	ownerDtlsRepo.findAll();
	
	
	
	ownerEntities.forEach(entity -> {
		
		Owner  owner = new Owner();
		
		BeanUtils.copyProperties(entity, owner);
		ownersList.add(owner);
		
		
	});
	
		return ownersList;
	}

}
