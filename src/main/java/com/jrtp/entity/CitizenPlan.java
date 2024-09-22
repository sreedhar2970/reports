package com.jrtp.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="CitizenPlan_info")
public class CitizenPlan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer CitizenID;
	private String CitizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitAmt;
	private String DenialReason;
	private LocalDate TerminationDate;
	private String Terminationreason;

}
