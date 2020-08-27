package com.ibm.currencyconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.currencyconversion.model.CurrencyConversion;
import com.ibm.currencyconversion.service.CurrencyConversionService;


@RestController
public class CurrencyConversionController {
	
	@Autowired
	CurrencyConversionService service;
	
	@RequestMapping(value="/convertCurrency" , method=RequestMethod.POST)
	public Double convertCurrency(@RequestBody CurrencyConversion curCon) {
		
		return service.calcCurrencyConversionV2(curCon);
		
	}

}
