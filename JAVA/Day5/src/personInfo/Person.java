package personInfo;

public class Person {
	private int pid;
	private String pname;

	static int cnt;
	
	static {
		cnt=0;
	}
	
	private final int c;
	public Person()
	{
		cnt++;
		pid=cnt;
		c=10;
	}
	
	public Person(String pname)
	{
		cnt++;
		this.pid=cnt;
		this.pname=pname;
		this.c=23;
		
	}
	
	public int getPId()
	{
		return pid;
	}
	public String getPName()
	{
		return pname;
	}
	
	public void setPName(String pname)
	{
		this.pname=pname;
	}
	
	public static int getCnt()
	{
		return cnt;
	}
	public static void setCnt(int cnt)
	{
		Person.cnt=cnt;
	}
	
	public String toString()
	{
		return "Person [pid=" + pid + ", pname=" + pname + ", c=" + c + "]";
	}
	
}
