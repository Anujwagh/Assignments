package com.demo.test;

import java.util.stream.IntStream;

import com.demo.arrays.Array;
import java.util.stream.Stream;


public class TestArray {

	public static void main(String[] args) {

		Array ob = new Array();
		System.out.println("Capacity :"+ob.getCapacity());
		ob.add(7);
		ob.add(9);
		ob.add(3);
		System.out.println("Size : "+ ob.getSize());
		System.out.println(ob);
		ob.add(5,1);
		System.out.println(ob);
		System.out.println("position of 9:"+ob.searchByValue(9));
		ob.add(13);
		ob.add(34);
		System.out.println(ob);
		
		ob.deleteByPos(4);
		System.out.println(ob);
		
		ob.deleteByValue(34);
		System.out.println(ob);

		ob.add(10);
		ob.add(27);
		System.out.println(ob);
		
		ob.rotateArray(true, 3 );
		System.out.println(ob);
		
		System.out.println("maximum number:"+ob.findmax());
		System.out.println("minimum number:"+ob.findmin());
		System.out.println("Sum:"+ob.findSum());
		
		
	}

}
