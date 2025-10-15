package enumdemo.com.demo.test;

import enumdemo.com.demo.enums.Coffee;

public class TestCoffee {

	public static void main(String[] args) {

		Coffee c = Coffee.medium;
		switch(c)
		
		{
		case small->{
			System.out.println("Small size"+c.getSize()+"-----"+c.getPrice());
		}
		
		case medium->{
			System.out.println("Medium " +c.getSize()+"------"+c.getPrice());
		}
		
		case large->{
			System.out.println("Large"+c.getSize()+"------"+c.getPrice());
		}
		}
	}

}
