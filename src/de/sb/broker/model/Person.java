package de.sb.broker.model;

import java.util.List;

public class Person extends BaseEntity {

	private String alias;
	private byte[] passwordHash;
	private Group group;
	private Name name;
	private Contact contact;
	private List<Auction> auctions;
	private List<Bid> bids;
	
	public Person(long identity, int version, long creationTimestamp) {
		super(identity, version, creationTimestamp);
		// TODO Auto-generated constructor stub
	}
	
	
	public byte[] passwordHash(String password){
		
		return new byte[32];
	}
	
	public byte[] getPasswordHash() {
		return passwordHash;
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

	public void setName(Name name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Auction> getAuctions() {
		return auctions;
	}

	public void setAuctions(List<Auction> auctions) {
		this.auctions = auctions;
	}

	public List<Bid> getBids() {
		return bids;
	}

	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}
	
}
