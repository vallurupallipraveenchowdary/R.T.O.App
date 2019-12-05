package com.praveen.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.entity.OwnerEntity;

@Repository
public interface OwnerDeatilsRepository extends JpaRepository<OwnerEntity, Integer> {

}
