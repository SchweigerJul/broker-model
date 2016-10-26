package de.sb.broker.model;

import javax.validation.constraints.NotNull;

public class Name {

	@NotNull
	private String family;

	@NotNull
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
