package de.sb.broker.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public class Person extends BaseEntity {

	@NotNull
	private String alias;

	private byte[] passwordHash;

	@NotNull
	private Group group;

	@NotNull
	@Valid
	private Name name;

	@NotNull
	@Valid
	private Contact contact;

	@NotNull
	@Valid
	private Address address;

	private Set<Auction> auctions;
	private Set<Bid> bids;

	public enum Group {
		ADMIN, USER
	}
	
	static public byte[] passwordHash(String password){
		MessageDigest messageDigest = null;

		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException: " + e.getStackTrace());
		}

		messageDigest.update(password.getBytes());
		return messageDigest.digest();
	}
	
	public Person() {
		super();
		this.alias = "";
		this.passwordHash = passwordHash("");
		this.group = Group.USER;
		this.name = new Name();
		this.contact = new Contact();
		this.address = new Address();
		this.auctions = new HashSet<>();
		this.bids = new HashSet<>();
	}
		
	public byte[] getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(byte[] passwordHash){
		this.passwordHash = passwordHash;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Name getName() {
		return name;
	}

	public Contact getContact() {
		return contact;
	}
	
	public Address getAddress() {
		return address;
	}

	public Set<Auction> getAuctions() {
		return auctions;
	}

	public Set<Bid> getBids() {
		return bids;
	}
}
