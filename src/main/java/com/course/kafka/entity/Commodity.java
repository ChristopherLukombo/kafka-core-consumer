package com.course.kafka.entity;

import java.util.Objects;

public class Commodity {

	private String name;
	
	private double price;
	
	private String measurement;
	
	private long timestamp;

	public Commodity(String name, double price, String measurement, long timestamp) {
		this.name = name;
		this.setPrice(price);
		this.measurement = measurement;
		this.timestamp = timestamp;
	}

	public Commodity() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = Math.round(price * 100d) / 100d;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(measurement, name, price, timestamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		return Objects.equals(measurement, other.measurement) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& timestamp == other.timestamp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Commodity [name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", measurement=");
		builder.append(measurement);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append("]");
		return builder.toString();
	}
	
	
}
