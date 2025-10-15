package com.demo.test;

import java.util.Scanner;

import com.demo.exception.WrongNumberException;

public class TestGuessNumber {

	public static void main(String[] args) {

		int num=96;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("enter a number:");
				int num1=sc.nextInt();
				
				if(num==num1)
				{
					System.out.println("yes, you guess it right");
					break;
				}
				else {
					if(num<num1) {
						throw new WrongNumberException("OOps, you miss it!! it is smaller number");
					}
					else
					{
						throw new WrongNumberException("OOps, you miss it!! it is larger number");

					}
				}
			}
			catch(WrongNumberException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
