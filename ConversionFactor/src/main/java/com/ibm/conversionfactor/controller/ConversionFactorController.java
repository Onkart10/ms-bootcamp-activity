package com.ibm.conversionfactor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.conversionfactor.model.Conversionfactor;
import com.ibm.conversionfactor.model.ConversionfactorResponse;
import com.ibm.conversionfactor.service.ConversionfactorService;

@RestController
public class ConversionFactorController {
	
	@Autowired
	ConversionfactorService service;
	
	@RequestMapping(value ="/addCF", method=RequestMethod.POST)
	public ConversionfactorResponse addConversionFactor(@RequestBody Conversionfactor conversionFactor) {
		service.addConversionFactor(conversionFactor);
		ConversionfactorResponse response = new ConversionfactorResponse(200,"Successfully added.");
		return response;
		
	}
	
	@RequestMapping(value ="/updateCF", method=RequestMethod.POST)
	public ConversionfactorResponse updateConversionFactor(@RequestBody Conversionfactor conversionFactor) {
		service.updateConversionFactor(conversionFactor);
		ConversionfactorResponse response = new ConversionfactorResponse(200,"Successfully updated.");
		return response;
		
	}
	
	@GetMapping(path = "/conversionFactor/{countryCode}")
	public Double getConversionFactor(@PathVariable String countryCode) {
		return service.getConversionFactor(countryCode);
		
	}
	
	

}
