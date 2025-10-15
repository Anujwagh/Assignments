package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 {

	private static int divide(int x, int y)
	{
		return x/y;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			
			System.out.println("Enter a number:");
			int num1 = sc.nextInt();
			try {
				int div = divide(num,num1);
				System.out.println("Division :" + div);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("in the outer try block");
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter number");
		}
		catch(Exception e)
		{
			System.out.println("error occured");
			System.out.println(e.getMessage());
		}
		
		
	}

}
