package com.sherlock.async.rabbitmqeventsender.model;

public class BasicProfile {

	private String name;
	private Integer phoneNumber;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override public String toString() {
		return "BasicProfile{" +
				"name='" + name + '\'' +
				", phoneNumber=" + phoneNumber +
				", email='" + email + '\'' +
				'}';
	}
}
