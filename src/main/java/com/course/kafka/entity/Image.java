package com.course.kafka.entity;

public class Image {
	
	private String name;
	
	private long size;
	
	private String type;

	public Image(String name, long size, String type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}

	public Image() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Image [name=");
		builder.append(name);
		builder.append(", size=");
		builder.append(size);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
}
