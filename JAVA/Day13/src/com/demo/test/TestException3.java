package com.demo.test;

import java.util.Scanner;

import com.demo.exception.NegativeSalaryException;

public class TestException3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Enter salary:");
				double sal=sc.nextDouble();
				
				if(sal<0) {
					throw new NegativeSalaryException("Salary cannot be -ve");
				}
				
				System.out.println("sal:"+sal);
				break;
					
				
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			catch(NegativeSalaryException e)
			{
				//System.out.println(e.getMessage());
				
				e.printStackTrace();
			}
		}
		
	}

}
