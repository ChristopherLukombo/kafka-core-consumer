package com.course.kafka.entity;

public class CarLocation {

	private String carId;
	
	private long timestamp;
	
	private int distance;

	public CarLocation(String carId, long timestamp, int distance) {
		this.carId = carId;
		this.timestamp = timestamp;
		this.distance = distance;
	}
	
	public CarLocation() {
		
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CarLocation [carId=");
		builder.append(carId);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", distance=");
		builder.append(distance);
		builder.append("]");
		return builder.toString();
	}
}
