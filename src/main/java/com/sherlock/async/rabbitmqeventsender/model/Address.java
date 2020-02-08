package com.sherlock.async.rabbitmqeventsender.model;

public class Address {

	private String addressType;
	private String line1;
	private String lien2;
	private String city;
	private String state;
	private String country ;

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLien2() {
		return lien2;
	}

	public void setLien2(String lien2) {
		this.lien2 = lien2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override public String toString() {
		return "Address{" +
				"addressType='" + addressType + '\'' +
				", line1='" + line1 + '\'' +
				", lien2='" + lien2 + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", country='" + country + '\'' +
				'}';
	}
}
