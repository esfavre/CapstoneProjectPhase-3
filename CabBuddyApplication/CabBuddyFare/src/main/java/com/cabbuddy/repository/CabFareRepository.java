package com.cabbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabbuddy.entity.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Integer>{

}
