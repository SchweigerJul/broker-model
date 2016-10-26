package de.sb.broker.model;

import javax.persistence.*;

@Embeddable
public class Name {
	
	@Column
	private String family;
	@Column
	private String given;	
	
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getGiven() {
		return given;
	}
	public void setGiven(String given) {
		this.given = given;
	}
	
}
