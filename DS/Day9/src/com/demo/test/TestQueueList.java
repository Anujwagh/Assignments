package com.demo.test;

import com.demo.linkedList.MyQueueList;

public class TestQueueList {

	public static void main(String[] args) {

		MyQueueList list= new MyQueueList();
		list.enQueue(23);
		list.enQueue(2);
		list.enQueue(65);
		list.enQueue(76);
		list.enQueue(12);
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
	}

}
