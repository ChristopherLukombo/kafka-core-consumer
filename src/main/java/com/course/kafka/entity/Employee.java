package com.course.kafka.entity;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Employee {

	private String employeeId;
	private String name;
	private LocalDate birthDate;

	public Employee(String employeeId, String name, LocalDate birthDate) {
		this.employeeId = employeeId;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Employee() {

	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDate, employeeId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [employeeId=");
		builder.append(employeeId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
