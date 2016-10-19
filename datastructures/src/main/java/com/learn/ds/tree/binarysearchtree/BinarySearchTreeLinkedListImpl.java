package com.learn.ds.tree.binarysearchtree;

import com.learn.ds.tree.binarytree.BinaryTreeNode;
import com.learn.ds.tree.binarytree.BinaryTreeTraversal;

public class BinarySearchTreeLinkedListImpl{

	private BinaryTreeNode rootNode;

	public void addElement(int data) {
		BinaryTreeNode newNode = new BinaryTreeNode(data);

		// If this is the first data, then this becomes the root node
		if(rootNode == null){
			rootNode = newNode;
		}else{	// Already tree created - Not an empty tree
			addToTree(rootNode, data, newNode);
		}
	}

	private void addToTree(BinaryTreeNode rootNode, int data, BinaryTreeNode nodeToAdd){
		while(true){
			int nodeData = (Integer)rootNode.getNodeData();
			if(data < nodeData){
				if(rootNode.getLeftChild() == null){
					rootNode.setLeftChild(nodeToAdd);
					break;
				}else{
					addToTree(rootNode.getLeftChild(), data, nodeToAdd);
					break;
				}
			}else if(data > nodeData){
				if(rootNode.getRightChild() == null){
					rootNode.setRightChild(nodeToAdd);
					break;
				}else{
					addToTree(rootNode.getRightChild(), data, nodeToAdd);
					break;
				}
			}else{
				break;
			}
		}
	}

	public void printElements(){
		BinaryTreeTraversal traversal = new BinaryTreeTraversal(rootNode);
//		traversal.performInOrderTraversal();
//		traversal.performPreOrderTraversal();
		traversal.performPostOrderTraversal();
	}
}
