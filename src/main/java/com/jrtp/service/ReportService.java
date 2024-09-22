package com.jrtp.service;

import java.util.List;

import com.jrtp.Request.SearchRequest;
import com.jrtp.entity.CitizenPlan;

public interface ReportService {
	 public List<String> getPlanNames();
	 public List<String> getPlanStatuses();
	 public List<CitizenPlan> getSearchdetails(SearchRequest searchrequest);
	 public boolean exportToPdf();
	 public boolean exportToExcel();
}
