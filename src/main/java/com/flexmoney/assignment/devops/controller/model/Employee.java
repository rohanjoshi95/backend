package com.flexmoney.assignment.devops.controller.model;

public class Employee {
	private Long empId;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(Long empId, String firstName, String lastName) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
