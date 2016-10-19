package com.learn.ds.tree.binarytree;

public class BinaryTreeNode<T> {

	private T nodeData;
	private BinaryTreeNode<T> rightChild;
	private BinaryTreeNode<T> leftChild;

	public BinaryTreeNode(T nodeData) {
		this.nodeData = nodeData;
	}

	public void setLeftChild(BinaryTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	public void setNodeData(T nodeData) {
		this.nodeData = nodeData;
	}

	public void setRightChild(BinaryTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	public BinaryTreeNode<T> getLeftChild() {
		return leftChild;
	}

	public T getNodeData() {
		return nodeData;
	}

	public BinaryTreeNode<T> getRightChild() {
		return rightChild;
	}
}
