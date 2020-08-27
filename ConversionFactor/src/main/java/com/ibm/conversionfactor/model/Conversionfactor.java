package com.ibm.conversionfactor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="conversionfactor")
public class Conversionfactor {
	
	/*
	 * 
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
	 */
	
	@Id
	@Column(name="countryCode", table="conversionfactor")
	private String countryCode;
	
	@Column(name="conversionFactor", table="conversionfactor")
	private double conversionFactor;
	
	public Conversionfactor() {
		super();
	}

	public Conversionfactor(String countryCode, float conversionFactor) {
		super();
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	
	

}
