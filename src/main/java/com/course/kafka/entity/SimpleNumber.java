package com.course.kafka.entity;

public class SimpleNumber {

	private int number;

	public SimpleNumber(int number) {
		this.number = number;
	}

	public SimpleNumber() {
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleNumber [number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}
}
