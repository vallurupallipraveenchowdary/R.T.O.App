package com.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.entity.OwnerAddressEntity;

public interface OwnerAddressRepository extends JpaRepository<OwnerAddressEntity, Integer> {

}
