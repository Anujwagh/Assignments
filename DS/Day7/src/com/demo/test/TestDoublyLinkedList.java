package com.demo.test;

import com.demo.linkedList.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		list.addnode(37);
		list.addnode(23);
		list.addnode(89);
		list.displayNode();
		list.addByValue(10,23);
		list.displayNode();
		list.addByPosition(3, 47);
		list.displayNode();
		list.deleteByValue(10);
		list.displayNode();
		list.deleteByPosition(2);
		list.displayNode();
	}

}
