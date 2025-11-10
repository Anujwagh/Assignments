package com.demo.linkedList;

public class CircularLinkedList {

	Node head;
	class Node{
		int data;
		Node next;
		 public Node(int data) {
			 this.data=data;
			 this.next=null;
		 }
	}
	
	public CircularLinkedList() {
		head = null;
	}

	//Add node 
	public void addNode(int val) {

		Node newNode= new Node(val);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
				
			}
			temp.next=newNode;
		}
		newNode.next=head;
		
	}

	public void displayData() {

		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			Node temp=head;
			
			do {
				System.out.print(temp.data+"----->");
				temp=temp.next;
			}while(temp!=head);
		}
		
		System.out.println("head");
	}
	
	
	
}
