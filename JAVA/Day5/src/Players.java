
public class Players {
	
	private int pid;
	private String pname;
	private String speciality;
	
	public Players(int id,String nm ,String sp) {
		this.pid=id;
		this.pname=nm;
		this.speciality=sp;
	}
	//Setter methods
	public void setId(int id)
	{
		this.pid=id;
	}
	public void setName(String nm)
	{
		this.pname=nm;
	}
	public void setSpeciality(String sp)
	{
		this.speciality=sp;
	}
	
	//getter methods
	public int getId()
	{
		return pid;
	}
	public String getName()
	{
		return pname;
	}
	public String getSpeciality()
	{
		return speciality;
	}
	
	@Override
	public String toString()
	{
		return "Player [Pid=" +pid + ",Pname=" + pname + ",Speciality=" + speciality +"]";
	}
	

}
