package com.omkar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double average;
	private String DOB;

	public Employee(int id, String name, double average, String dOB) {
		super();
		this.id = id;
		this.name = name;
		this.average = average;
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public String getDOB() {
		return DOB;
	}

	public int getAge() {

		LocalDate birthDate = LocalDate.parse(DOB, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate currentDate = LocalDate.now();
		return currentDate.getYear() - birthDate.getYear();
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	@Override
	public int compareTo(Employee o) {
		if (o.getAverage() != this.getAverage()) {
			return Double.compare(o.getAverage(), this.getAverage());
		} else if (this.average == o.getAverage()) {
			return Integer.compare(o.getAge(), this.getAge());
		} else if (this.average == o.getAverage() && this.getAge() == o.getAge()) {
			return o.getName().compareTo(this.getName());
		} else
			return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", average=" + average + ", DOB=" + DOB + "]";
	}

	
}
