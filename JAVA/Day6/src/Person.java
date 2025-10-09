import java.util.Date;

public class Person {
	static int count;
	static {
		count=0;
	}
	
	private String pid;
	private String pname;
	private Date bdate;
	public Person() {
		super();
		System.out.println("Default Constructor called");
		count++;
		pid="s" + count;
	}
	
	public Person(String emptype , String pname , Date bdate)
	{
		System.out.println("Parameterized Constructor called");
		count++;
		this.pid=emptype + count;
		this.pname=pname;
		this.bdate=bdate;
		
	}
	
	public String getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
				return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + bdate + "]";
	}
	
	
}
