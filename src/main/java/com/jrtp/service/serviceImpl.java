package com.jrtp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.jrtp.Request.SearchRequest;
import com.jrtp.entity.CitizenPlan;
import com.jrtp.repository.citizenPlanRepository;

@Service
public class serviceImpl  implements ReportService{

	@Autowired
	public citizenPlanRepository planRepository;
	@Override
	public List<String> getPlanNames() {
		
		return planRepository.getplanNmaes();
	}

	@Override
	public List<String> getPlanStatuses() {
		// TODO Auto-generated method stub
		return planRepository.getplanStatus();
	}

	@Override
	public List<CitizenPlan> getSearchdetails(SearchRequest searchrequest) {
		CitizenPlan entity = new CitizenPlan();
		if(null!=searchrequest.getPlanName() && "".equals(searchrequest.getPlanName())){
			entity.setPlanName(searchrequest.getPlanName());
		}
		
		if(null!=searchrequest.getPlanStatus() && "".equals(searchrequest.getPlanStatus())){
			entity.setPlanStatus(searchrequest.getPlanStatus());
		}
		
		if(null!=searchrequest.getGender() && "".equals(searchrequest.getGender())){
			entity.setGender(searchrequest.getGender());
		}
		return planRepository.findAll(Example.of(entity));
	}

	@Override
	public boolean exportToPdf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportToExcel() {
		// TODO Auto-generated method stub
		return false;
	}

}
