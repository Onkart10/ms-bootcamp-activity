package com.ibm.conversionfactor.model;

public class ConversionfactorResponse {
	
	private int status;
	private String message;	
	
	public ConversionfactorResponse(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public ConversionfactorResponse() {
		super();
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
