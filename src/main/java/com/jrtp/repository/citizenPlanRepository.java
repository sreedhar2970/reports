package com.jrtp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jrtp.entity.CitizenPlan;

public interface citizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{
	
	@Query("select distinct(planName) from CitizenPlan")
	public List<String> getplanNmaes();
	
	@Query("select distinct(planStatus) from CitizenPlan")
	public List<String> getplanStatus();
			

}
