package com.learn.ds.tree;

import org.junit.Test;

import com.learn.ds.tree.binarysearchtree.BinarySearchTreeLinkedListImpl;

public class BinarySearchTreeTest {

	@Test
	public void testBinarySearchTreeLinkedListImpl(){
		BinarySearchTreeLinkedListImpl binarySearchTree = new BinarySearchTreeLinkedListImpl();
		binarySearchTree.addElement(10);
		binarySearchTree.addElement(30);
		binarySearchTree.addElement(2);
		binarySearchTree.addElement(23);
		binarySearchTree.addElement(6);
		binarySearchTree.addElement(20);
		binarySearchTree.addElement(70);
		binarySearchTree.printElements();
	}

}
