package com.course.kafka.entity;

public class PaymentRequest {

	private String paymentNumber;
	
	private int amount;
	
	private String currency;
	
	private String notes;
	
	private String transactionType;

	public PaymentRequest(String paymentNumber, int amount, String currency, String notes, String transactionType) {
		this.paymentNumber = paymentNumber;
		this.amount = amount;
		this.currency = currency;
		this.notes = notes;
		this.transactionType = transactionType;
	}

	public PaymentRequest() {
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentRequest [paymentNumber=");
		builder.append(paymentNumber);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", notes=");
		builder.append(notes);
		builder.append(", transactionType=");
		builder.append(transactionType);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
