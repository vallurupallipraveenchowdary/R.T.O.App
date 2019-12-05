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
	private OwnerDeatilsRepository userDtlsRepo;
	
	@Override
	public boolean saveUserDetails(Owner user) {
		//logic to insert data
		
		OwnerEntity entity = new OwnerEntity();
		
		// copy data from domain obj to entity obj
		
		BeanUtils.copyProperties(user, entity);
		
		OwnerEntity savedEntity =  userDtlsRepo.save(entity);
		return savedEntity.getUserid() > 0;
	}

	@Override
	public List<Owner> retriveAllUsers() {
		//logic to retrive records
		
		List<Owner> usersList = new ArrayList<Owner>();
		
		PageRequest pageRequest = PageRequest.of(0,5);
		
	Page<OwnerEntity> findAll =	userDtlsRepo.findAll(pageRequest);
	
	List<OwnerEntity> userEntities = findAll.getContent();
	
	//List<UserEntity> userEntities =	userDtlsRepo.findAll();
	
	
	
	userEntities.forEach(entity -> {
		
		Owner  user = new Owner();
		
		BeanUtils.copyProperties(entity, user);
		usersList.add(user);
		
		
	});
	
		return usersList;
	}

}
