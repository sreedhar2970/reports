package com.jrtp.Runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.jrtp.entity.CitizenPlan;
import com.jrtp.repository.citizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	public citizenPlanRepository planRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		planRepository.deleteAll();
		//cash
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Sreedhar");
		c1.setGender("Male");
		c1.setPlanName("cash");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanStatus("Approved");
        c1.setPlanEndDate(LocalDate.now().plusMonths(6));
        c1.setBenefitAmt(5000.00);
        
        CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Prem");
		c2.setGender("Male");
		c2.setPlanName("cash");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanStatus("Approved");
        c2.setPlanEndDate(LocalDate.now().plusMonths(6));
        c2.setBenefitAmt(8000.00);
        
        CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("akbar");
		c3.setGender("Male");
		c3.setPlanName("cash");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanStatus("Terminated");
        c3.setPlanStartDate(LocalDate.now().minusMonths(4));
        c3.setBenefitAmt(5000.00);
        c3.setTerminationDate(LocalDate.now());
        c3.setTerminationreason("Employed");
        
        //FoodPlanData
        CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Ananth");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanStatus("Approved");
        c4.setPlanEndDate(LocalDate.now().plusMonths(6));
        c4.setBenefitAmt(3000.00);
        
        CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Naveen");
		c5.setGender("Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Government employee");
        
        CitizenPlan c6= new CitizenPlan();
		c6.setCitizenName("Pavan");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStartDate(LocalDate.now());
		c6.setPlanStatus("Terminated");
        c6.setPlanStartDate(LocalDate.now().minusMonths(4));
        c6.setBenefitAmt(5000.00);
        c6.setTerminationDate(LocalDate.now());
        c6.setTerminationreason("Employed");
        
        //Medical Plan Data
        
        CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("tanvi");
		c7.setGender("Fe-Male");
		c7.setPlanName("Medical");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanStatus("Approved");
        c7.setPlanEndDate(LocalDate.now().plusMonths(6));
        c7.setBenefitAmt(5000.00);
        
        CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Deepti");
		c8.setGender("Fe-Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Rich candidate");
		
        
        CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Shubham");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanStatus("Terminated");
        c9.setPlanStartDate(LocalDate.now().minusMonths(4));
        c9.setBenefitAmt(5000.00);
        c9.setTerminationDate(LocalDate.now());
        c9.setTerminationreason("Employed");
        
        //Employment plan
        
        
        CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("vamshi");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanStatus("Approved");
        c10.setPlanEndDate(LocalDate.now().plusMonths(6));
        c10.setBenefitAmt(5000.00);
        
        CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("abhi");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
        c11.setDenialReason("Business");
        
        CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("akbar");
		c12.setGender("Male");
		c12.setPlanName("Employment");
		c12.setPlanStartDate(LocalDate.now());
		c12.setPlanStatus("Terminated");
        c12.setPlanStartDate(LocalDate.now().minusMonths(4));
        c12.setBenefitAmt(5000.00);
        c12.setTerminationDate(LocalDate.now());
        c12.setTerminationreason("Employed");
	
        
        List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
       	planRepository.saveAll(list);
	}
}
