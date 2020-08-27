package com.ibm.currencyconversion.model;

public class CurrencyConversion {
	
	private String countryCode;
	private double amount;
	
	public CurrencyConversion(String countryCode, double amount) {
		super();
		this.countryCode = countryCode;
		this.amount = amount;
	}
	
	public CurrencyConversion() {
		super();
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
