package com.course.kafka.entity;

import java.util.Objects;

public class PaymentRequestCacheKey {

	private String paymentNumber;
	
	private int amount;
	
	private String transactionType;

	public PaymentRequestCacheKey(String paymentNumber, int amount, String transactionType) {
		this.paymentNumber = paymentNumber;
		this.amount = amount;
		this.transactionType = transactionType;
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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(amount, paymentNumber, transactionType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentRequestCacheKey other = (PaymentRequestCacheKey) obj;
		return amount == other.amount && Objects.equals(paymentNumber, other.paymentNumber)
				&& Objects.equals(transactionType, other.transactionType);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentRequest [paymentNumber=");
		builder.append(paymentNumber);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", transactionType=");
		builder.append(transactionType);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
