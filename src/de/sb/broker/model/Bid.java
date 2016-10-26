package de.sb.broker.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Bid extends BaseEntity{

	@Min(0)
	private long price;

	@NotNull
	private Auction auction;

	@NotNull
	private Person bidder;
	
	public Bid(Auction auction, Person bidder) {
		super();
		
		this.price = 0;
		this.auction = auction;
		this.bidder = bidder;
	}
	
	protected Bid() {
		this(null, null);
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

	public long getAuctionReference(){
		return auction==null ? 0 : auction.getIdentity();
	}
	public long getBidderReference(){
		return bidder==null ? 0 : bidder.getIdentity();
	}
}
