package com.demo.test;

public class HashTable {
	
	Node[] heads;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	

	public HashTable() {
		heads= new Node[10];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	
	public HashTable(int size) {
		heads= new Node[size];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}


	public void insertData(int val) {
		Node newNode = new Node(val);
		
		int pos = val%heads.length;
		
		if(heads[pos]!=null) {
			newNode.next=heads[pos];
		}
		heads[pos]=newNode;
		
		
	}


	
	public void displayData() {
		for(int i=0;i<heads.length;i++) {
			Node temp=heads[i];
			System.out.print(i+"--->");
			while(temp!=null) {
				System.out.print(temp.data+"----->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}

	
	
	public boolean searchData(int val) {
		
		int pos = val%heads.length;
		
		Node temp=heads[pos];
		
		while(temp!=null) {
			if(temp.data==val) {
				System.out.println(val + " found in  bucket "+pos);
				return true;
			}
			temp=temp.next;
		}
		
		System.out.println(val + " not found in  bucket "+pos);
		return false;
	}

}
