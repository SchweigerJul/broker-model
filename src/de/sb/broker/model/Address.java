package de.sb.broker.model;

import javax.persistence.*;

@Embeddable
public class Address {
	
	@Column
	private String street;
	@Column
	private String postCode;
	@Column
	private String city;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
