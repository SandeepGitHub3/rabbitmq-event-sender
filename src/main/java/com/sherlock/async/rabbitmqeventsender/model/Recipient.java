package com.sherlock.async.rabbitmqeventsender.model;

import java.util.List;

public class Recipient {
	private BasicProfile basicProfile;
	private List<Address> addresses;

	public BasicProfile getBasicProfile() {
		return basicProfile;
	}

	public void setBasicProfile(BasicProfile basicProfile) {
		this.basicProfile = basicProfile;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override public String toString() {
		return "Recipient{" +
				"basicProfile=" + basicProfile +
				", addresses=" + addresses +
				'}';
	}
}
