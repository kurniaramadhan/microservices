package com.dewacoding.loansservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dewacoding.loansservice.configs.LoansServiceConfig;
import com.dewacoding.loansservice.model.Customer;
import com.dewacoding.loansservice.model.Loans;
import com.dewacoding.loansservice.model.Properties;
import com.dewacoding.loansservice.repository.LoansRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
public class LoansController {
	
	@Autowired
	LoansRepository loansRepository;
	
	@Autowired
	LoansServiceConfig loansConfig;
	
	@PostMapping("/myLoans")
	public List<Loans> getLoansDetails(@RequestBody Customer customer) {
		List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDateDesc(customer.getCustomerId());
		
		if (loans != null) {
			return loans;
		} else {
			return null;
		}
	}
	
	@GetMapping("/loans/properties")
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Properties properties = new Properties(loansConfig.getMsg(), loansConfig.getBuildVersion(), loansConfig.getMailDetails(), loansConfig.getActiveBranches());
		
		String jsonStr = ow.writeValueAsString(properties);
		
		return jsonStr;
	}
}
