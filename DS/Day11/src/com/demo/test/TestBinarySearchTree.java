package com.demo.test;

import com.demo.trees.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {

		BinarySearchTree btr = new BinarySearchTree();
		btr.insertNode(31);
		btr.insertNode(15);
		btr.insertNode(17);
		btr.insertNode(18);
		btr.insertNode(10);
		btr.insertNode(40);
		btr.insertNode(32);
		btr.insertNode(45);
		btr.insertNode(33);
		
		System.out.println("Inorder :");
		btr.inorder();
		System.out.println("preorder");
		btr.preorder();
		System.out.println("postorder");
		btr.postorder();
		
		btr.search(32);
		btr.searchNonRecurssive(31);
		
		btr.deleteNode(18);
		btr.inorder();
		btr.deleteNode(32);
		btr.inorder();
		btr.deleteNode(15);
		btr.inorder();
	}

}
