package com.course.kafka.entity;

public class FoodOrder {

	private int amount;
	
	private String item;

	public FoodOrder(int amount, String item) {
		this.amount = amount;
		this.item = item;
	}

	public FoodOrder() {
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodOrder [amount=");
		builder.append(amount);
		builder.append(", item=");
		builder.append(item);
		builder.append("]");
		return builder.toString();
	}
}
