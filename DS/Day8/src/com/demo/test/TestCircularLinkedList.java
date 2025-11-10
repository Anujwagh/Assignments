package com.demo.test;

import com.demo.linkedList.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {

		CircularLinkedList list = new CircularLinkedList();
		
		list.addNode(20);
		list.addNode(34);
		list.addNode(82);
		list.displayData();
	}

}
