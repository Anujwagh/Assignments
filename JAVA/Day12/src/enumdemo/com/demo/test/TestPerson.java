package enumdemo.com.demo.test;

import java.util.Scanner;

import enumdemo.com.demo.beans.Person;
import enumdemo.com.demo.enums.Gender;

public class TestPerson {

	public static void main(String[] args) {

		Person p1=new Person(07,"Rahul",Gender.male);
		System.out.println(p1);
		
		for(Gender g:Gender.values()) {
			System.out.println(g);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id:");
		int pid=sc.nextInt();
		
		System.out.println("enter name:");
		String pname=sc.next();
		
		System.out.println("enter gender:");
		String g=sc.next();
		
		
		Gender g1=Gender.valueOf(g);
		Person p2=new Person(pid,pname,g1);
		System.out.println(p2);
		System.out.println(Gender.valueOf(g));
	}

}
