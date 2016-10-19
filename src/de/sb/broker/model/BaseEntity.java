package de.sb.broker.model;

public abstract class BaseEntity implements Comparable<BaseEntity>{
	private long identity;
	private int version;
	private long creationTimestamp;
	
	public BaseEntity(long identity, int version, long creationTimestamp){
		this.identity=identity;
		this.version=version;
		this.creationTimestamp=creationTimestamp;
		
	}
	
	public int compareTo(BaseEntity e){
		return version;
		
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
	public void setIdentity(long identity) {
		this.identity = identity;
	}
	public long getCreationTimestamp() {
		return creationTimestamp;
	}



	public void setCreationTimestamp(long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}
}
