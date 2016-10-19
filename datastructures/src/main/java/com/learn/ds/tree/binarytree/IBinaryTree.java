package com.learn.ds.tree.binarytree;

/*
	Binary Tree is a special kind of tree in which each node can 
	have at most 2 child nodes.

	Since node can have at most 2 nodes, we name the child nodes as left,
	and right node

	Specially we have a binary search tree in which we get log n [to base 2] performance.

	Binary tree is expected to balanced - to have short height.

	Short tree are efficient than the taller binary tree.

 */
public interface IBinaryTree<T>{

	public void addElement(T data);

	public void removeElement(BinaryTreeNode<T> node);

	public void removeElement(int index);

	public BinaryTreeNode<T> getElement(int index);

}
