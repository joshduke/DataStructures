package com.learn.ds.tree;

import org.junit.Test;

import com.learn.ds.tree.binarytree.BinaryTreeLinkedListImpl;

public class BinaryTreeTest {
	
	
	@Test
	public void testBTLinkedListImpl(){
		BinaryTreeLinkedListImpl<String> bt = new BinaryTreeLinkedListImpl<String>();
		bt.addData("A");
		bt.addData("B");
		bt.addData("C");
		bt.addData("D");
		bt.addData("E");
		bt.printElements();
	}

}
