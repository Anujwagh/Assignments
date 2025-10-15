package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exception.NegativeSalaryException;

public class Service {
	
	public void acceptData() throws NegativeSalaryException
	{
		Scanner sc = new Scanner(System.in);
		Employee e=new Employee(101,"Sahil",75999.00);
		e.setSal(1500);
		
	}

}
