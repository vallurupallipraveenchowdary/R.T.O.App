package com.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.entity.VehicleDetailsEntity;

@Repository
public interface VehicleDetailsRepository extends JpaRepository<VehicleDetailsEntity, Integer> {

}
