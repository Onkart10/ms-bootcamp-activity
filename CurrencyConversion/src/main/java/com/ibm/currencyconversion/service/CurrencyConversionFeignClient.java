package com.ibm.currencyconversion.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="conversionfactorms", fallback = CurrencyConversionFallBack.class)
public interface CurrencyConversionFeignClient {
	
	@RequestMapping(value ="/conversionFactor/{countryCode}")
	public Double calcCurrencyConversion(@PathVariable("countryCode") String countryCode);

}
