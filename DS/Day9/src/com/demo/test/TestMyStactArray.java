package com.demo.test;

import com.demo.linkedList.MyStackArray;

public class TestMyStactArray {

	public static void main(String[] args) {


		MyStackArray ob = new MyStackArray(5);
		ob.pushValue(23);
		ob.pushValue(56);
		ob.pushValue(75);
		ob.pushValue(34);
		ob.pushValue(7);
		ob.pushValue(6);
		
		System.out.println("-----------------------");
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
		System.out.println(ob.popValue());
	}

}
