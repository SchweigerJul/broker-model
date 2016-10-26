package de.sb.broker.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="discriminator", discriminatorType=DiscriminatorType.STRING)
@Table(name="BaseEntity", schema="broker")
public abstract class BaseEntity implements Comparable<BaseEntity>{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long identity;
	
	@Version
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
