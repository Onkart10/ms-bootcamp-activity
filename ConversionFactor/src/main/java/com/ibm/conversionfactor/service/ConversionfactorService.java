package com.ibm.conversionfactor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.conversionfactor.model.Conversionfactor;
import com.ibm.conversionfactor.repository.ConversionfactorRepository;


@Service
public class ConversionfactorService {
	
	@Autowired
	ConversionfactorRepository repo;
	
	public void addConversionFactor(Conversionfactor conversionFactor) {
		repo.save(conversionFactor);
	}
	
	public void updateConversionFactor(Conversionfactor conversionFactor) {
		repo.save(conversionFactor);
	}

	public Double getConversionFactor(String countryCode) {		
		Conversionfactor conversionFactor = repo.getOne(countryCode);
		double cf = conversionFactor.getConversionFactor();
		System.out.println("getConversionFactor:"+cf);
		return cf;
	
	}
	

}