package com.course.kafka.entity;

public class PurchaseRequest {

	private int id;
	
	private String prNumber;
	
	private int amount;
	
	
	private String currency;

	

	public PurchaseRequest(int id, String prNumber, int amount, String currency) {
		this.id = id;
		this.prNumber = prNumber;
		this.amount = amount;
		this.currency = currency;
	}
	

	public PurchaseRequest() {
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrNumber() {
		return prNumber;
	}


	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
