package com.demo.beans;

import java.time.LocalDate;

public class Employee {

	private int empid;
	private String ename;
	private double sal;
	private LocalDate jdt;
	
	public Employee()
	{
		super();
	}
	
	public Employee (int empid)
	{
		super();
		this.empid=empid;
	}
	
	
	public Employee(int empid, String ename, double sal, LocalDate jdt) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.jdt = jdt;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.empid+"----"+((Employee)obj).empid);
		return this.empid==((Employee)obj).empid;
	}
	
	public void setEmpId(int empid)
	{
		this.empid=empid;
		
	}
	public void setENAme(String ename)
	{
		this.ename=ename;
		
	}
	public void setSAl(double sal)
	{
		this.sal=sal;
		
	}
	public void setLocalDate(LocalDate jdt)
	{
		this.jdt=jdt;
		
	}
	
	public int getEmpid()
	{
		return empid;
	}
	public String getEName()
	{
		return ename;
	}
	public double getSalary()
	{
		return sal;
	}
	public LocalDate getLocalDate()
	{
		return jdt;
	}
	
	
	
	public String tostring()
	{
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", jdt=" + jdt + "]";
	}
	
	

}
