package de.sb.broker.model;

import java.util.ArrayList;
import java.util.List;

public class Auction extends BaseEntity {
	private String title;
	private short unitCount;
	private long askingPrice;
	private long closureTimestamp;
	private String description;
	private Person seller;
	private List<Bid> bids;
	
	public Auction(long identity, int version, long creationTimestamp, String title, short unitCount, long askingPrice, long closureTimestamp, String description, Person seller) {
		super(identity, version, creationTimestamp);
		
		this.title=title;
		this.unitCount=unitCount;
		this.askingPrice=askingPrice;
		this.closureTimestamp=closureTimestamp;
		this.description=description;
		this.seller=seller;
		bids=new ArrayList<Bid>();
		
		// TODO Auto-generated constructor stub
	}
	

	public long getAuctionReference(){
		return 0;
	}
	public boolean isClosed(){
		return false;
	}
	
	public boolean isSealed(){
		return false;
	}
	
	public Bid getBid(Person bidder) {
		
		return bids.get(0);
		
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
