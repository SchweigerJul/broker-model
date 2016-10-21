package de.sb.broker.model;

public abstract class BaseEntity implements Comparable<BaseEntity>{
	private long identity;
	private int version;
	private long creationTimestamp;
	
	public BaseEntity(){
		this.version=1;
		this.creationTimestamp=System.currentTimeMillis();
		
	}
	
	public int compareTo(BaseEntity e){
		return Long.compare(this.identity, e.identity);
		
	}
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public long getIdentity() {
		return identity;
	}
	public long getCreationTimestamp() {
		return creationTimestamp;
	}

}
