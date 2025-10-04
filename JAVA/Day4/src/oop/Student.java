package oop;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private float m1;
	private float m2;
	private Date bdate;
	
	public Student()
	{
		System.out.println("This is default constructor");
		int id=0;
		String name=null;
		float m1=0;
		float m2=0;
		Date bdate=null;
		
	}
	
	public Student(int id,String nm,float m1,float m2,Date bdt)
	{
		this.id=id;
		name=nm;
		this.m1=m1;
		this.m2=m2;
		bdate=bdt;
		
		
	}
	
	
	public void setID(int id)
	{
		this.id=id;
		
	}
	public void setName(String nm)
	{
		name=nm;
		
	}
	public void setM1(float m1)
	{
		this.m1=m1;
		
	}
	public void setM2(float m2)
	{
		this.m2=m2;

		
	}
	public void setDate(Date bdt)
	{
		bdate=bdt;
		
	}
	
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	public float getM1()
	{
		return m1;
	}
	public float getM2()
	{
		return m2;
	}
	public Date getDate()
	{
		return bdate;
	}
	
	
	public String toString() {
		System.out.println("toString method called:");
		
		return "ID:"+id+","+"SName:"+name+","+"M1:"+m1+","+"M2:"+m2+","+"BDate:"+bdate;
	}
	
	
}
