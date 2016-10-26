package de.sb.broker.model;

import javax.persistence.Embeddable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

@Embeddable
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
