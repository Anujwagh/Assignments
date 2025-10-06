import java.util.Arrays;

public class Teams {
	
	private int tid;
	private String tname;
	private Players captain;
	private Players []plist;
	private int size;
	
	public Teams(int tid, String tname ,Players captain ,Players []plist ,int size)
	{
		this.tid=tid;
		this.tname=tname;
		this.captain=captain;
		this.plist=plist;
		this.size=size;
		
		
	}
	
	
	public void setTid(int tid)
	{
		this.tid=tid;
	}
	public void setTName(String tname)
	{
		this.tname=tname;
	}
	public void setCaptain(Players captain)
	{
		this.captain=captain;
	}
	public void setPList(Players[] plist)
	{
		this.plist=plist;
	}
	public void setSize(int size)
	{
		this.size=size;
	}
	
	
	public int getTid()
	{
		return tid;
	}
	public String getTName()
	{
		return tname;
	}
	public Players getCaptain()
	{
		return captain;
	}
	public Players[] getPlist()
	{
		return plist;
	}
	public int getSize()
	{
		return size;
	}
	
	
	public String toString()
	{
		return "Team [tid=" + tid + ", tname=" + tname + ", captain=" + captain + ", plist=" + Arrays.toString(plist)
		+ "]";
	}

}
