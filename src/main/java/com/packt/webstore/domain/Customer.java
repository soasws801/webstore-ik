package com.packt.webstore.domain;

public class Customer {

	private String customerId;
	private String firstName;
	private String lastName;
	private String address;
	private long noOfOrdersMade;
	
	public Customer() {
		super();
	}

	public Customer(String customerId, String firstName, String lastName) {
		this.setCustomerId(customerId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + customerId + ", name=" + firstName + " " + lastName + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(long noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
