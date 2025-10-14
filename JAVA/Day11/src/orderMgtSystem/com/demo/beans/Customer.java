package orderMgtSystem.com.demo.beans;

public class Customer {
	private int cid;
	private String cname;
	private String mob;
	public Customer(int cid2) {
		super();
	}
	public Customer(int cid, String cname, String mob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mob = mob;
	}
	
	
	@Override
	public int hashCode() {
		System.out.println("In hashcode"+cid);
		return cid;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.cid+"-----"+((Customer)obj).cid);
		return this.cid==((Customer)obj).cid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mob=" + mob + "]";
	}
	
	

}
