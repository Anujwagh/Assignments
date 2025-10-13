package map.com.demo.beans;

public class Course {
	private String cname;
	private int capacity;
	public Course(String cname, int capacity) {
		super();
		this.cname = cname;
		this.capacity = capacity;
	}
	public Course() {
		super();
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", capacity=" + capacity + "]";
	}
	
	

}
