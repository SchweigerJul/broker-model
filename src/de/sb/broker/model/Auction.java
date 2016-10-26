package de.sb.broker.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class Auction extends BaseEntity {

	@NotNull
	private String title;

	@Min(0)
	private short unitCount;

	@Min(0)
	private long askingPrice;

	private long closureTimestamp;

	@NotNull
	private String description;

	@NotNull
	private Person seller;
	private Set<Bid> bids;

	public Auction(Person seller) {
		super();	

		this.title = "";
		this.unitCount = 1;
		this.askingPrice = 1;
		this.closureTimestamp = System.currentTimeMillis();
		this.description = "";
		this.seller = seller;
		bids = new HashSet<>(); 
	}

	protected Auction() {
		this(null);
	}

	public long getSellerReference() {
		return seller==null ? 0 : seller.getIdentity();	
	}

	public boolean isClosed() {
		return System.currentTimeMillis() > closureTimestamp ? true : false;
	}

	public boolean isSealed() {
		return !bids.isEmpty() || isClosed();
	}

	public Bid getBid(Person bidder) {
		for (Bid bid : bids) {
			if (bid.getBidder().equals(bidder)) {
				return bid;
			}
		}
		return null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public short getUnitCount() {
		return unitCount;
	}

	public void setUnitCount(short unitCount) {
		this.unitCount = unitCount;
	}

	public long getAskingPrice() {
		return askingPrice;
	}

	public void setAskingPrice(long askingPrice) {
		this.askingPrice = askingPrice;
	}

	public long getClosureTimestamp() {
		return closureTimestamp;
	}

	public void setClosureTimestamp(long closureTimestamp) {
		this.closureTimestamp = closureTimestamp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Person getSeller() {
		return seller;
	}

}
