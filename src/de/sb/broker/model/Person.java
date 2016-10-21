package de.sb.broker.model;

import java.util.HashSet;
import java.util.Set;

public class Person extends BaseEntity {

	private String alias;
	private byte[] passwordHash;
	private Group group;
	private Name name;
	private Contact contact;
	private Address address;
	private Set<Auction> auctions;
	private Set<Bid> bids;
	public static enum Group {
		ADMIN, USER
	}
	
	static public byte[] passwordHash(String password){
		//TODO SHA256
		return new byte[32];
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
