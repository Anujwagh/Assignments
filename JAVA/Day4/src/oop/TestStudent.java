package oop;

import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Yash",89,90,new Date());
		System.out.println(s1);
		
		
		Student s2 = new Student(105,"Ram",85,80,new Date());
		System.out.println(s2);

	}

}
