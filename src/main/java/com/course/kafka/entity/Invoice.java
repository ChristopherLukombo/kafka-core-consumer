package com.course.kafka.entity;

public class Invoice {

	private String invoiceNumber;
	
	private int amount;
	
	private String currency;

	public Invoice(String invoiceNumber, int amount, String currency) {
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
		this.currency = currency;
	}

	public Invoice() {
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [invoiceNumber=");
		builder.append(invoiceNumber);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", currency=");
		builder.append(currency);
		builder.append("]");
		return builder.toString();
	}
	
	
}
