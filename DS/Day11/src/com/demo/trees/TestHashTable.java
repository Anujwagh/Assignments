package com.demo.trees;

import com.demo.test.HashTable;

public class TestHashTable {

	public static void main(String[] args) {

		HashTable ht = new HashTable(5);
		ht.insertData(45);
		ht.insertData(47);
		ht.insertData(2);
		ht.insertData(3);
		ht.insertData(7);
		ht.insertData(21);
		ht.insertData(25);
		ht.insertData(15);
		ht.insertData(12);
		ht.insertData(11);
		ht.insertData(48);
		ht.insertData(55);
		ht.displayData();
		
		ht.searchData(48);
		ht.searchData(123);
	}

}
