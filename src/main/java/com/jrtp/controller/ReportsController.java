package com.jrtp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jrtp.Request.SearchRequest;
import com.jrtp.entity.CitizenPlan;
import com.jrtp.service.ReportService;
import com.jrtp.service.serviceImpl;

@Controller
public class ReportsController {

	@Autowired
	public ReportService reportService;
	
	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("search",new SearchRequest());
		init(model);	
		return index;
	}
	
	@PostMapping("Search")
	public String handleSearch(SearchRequest searchRequest, Model model) {
		List<CitizenPlan> plans =reportService.getSearchdetails(searchRequest);
		model.addAttribute("Plans", plans);
		model.addAttribute("search", searchRequest);
		init(model);
		return index;
	}

	private void init(Model model) {
		//model.addAttribute("search",new SearchRequest());
		model.addAttribute("names", reportService.getPlanNames());
		model.addAttribute("status",reportService.getPlanStatuses());
	}
}
