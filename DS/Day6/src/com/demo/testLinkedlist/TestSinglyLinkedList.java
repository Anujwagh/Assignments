package com.demo.testLinkedlist;

import com.demo.linkedlists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		list.addNode(12);
		list.addNode(10);
		list.addNode(15);
		list.addNode(7);
		list.addNode(2);
		list.displayData();
		list.addByPosition(1,100);
		list.addByPosition(3, 200);

		list.addByPosition(8, 300);

		list.addByPosition(20, 400);
		list.displayData();
	}

}
