package com.demo.test;

import com.demo.linkedList.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {

	public static void main(String[] args) {

		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.addNode(63);
		list.addNode(21);
		list.addNode(74);
		list.displayData();
		
		//list.displayReverseData();
		
		list.addByPosition(1,32);
		list.addByPosition(4, 46);
		list.displayData();
		
		list.addByValue(200,32);
		list.displayData();
		
		list.deleteByPosition(6);
		list.displayData();
		
		list.deleteByValue(21);
		list.displayData();
		
	}

}
