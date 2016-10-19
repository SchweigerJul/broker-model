package de.sb.broker.model;

public class Bid extends BaseEntity{

	private long price;
	private Auction auction;
	private Person bidder;
	
	public Bid(long identity, int version, long creationTimestamp, long price, Auction auction, Person bidder) {
		super(identity, version, creationTimestamp);
		this.price=price;
		this.auction=auction;
		this.bidder=bidder;
		
	}
	
	public Auction getAuction() {
		return auction;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}

	public Person getBidder() {
		return bidder;
	}
	
	public long getBidderReference(){
		return 0;
	}
}
