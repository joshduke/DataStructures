package com.learn.ds.tree.binarytree;

public class BinaryTreeTraversal<T> {

	private BinaryTreeNode<T> headNode;

	public BinaryTreeTraversal(BinaryTreeNode<T> rootNode) {
		this.headNode = rootNode;
	}
	

	public void performInOrderTraversal(){
		traverseInOrder(headNode);
	}

	public void performPreOrderTraversal(){
		traversePreOrder(headNode);
	}

	public void performPostOrderTraversal(){
		traversePostOrder(headNode);
	}

	private void traverseInOrder(BinaryTreeNode<T> node){
		if(node != null){
			if(node.getLeftChild() != null){
				traverseInOrder(node.getLeftChild());
			}

			System.out.println(node.getNodeData());

			if(node.getRightChild() != null){
				traverseInOrder(node.getRightChild());
			}
		}
	}
	
	private void traversePreOrder(BinaryTreeNode<T> node){
		if(node != null){
			
			System.out.println(node.getNodeData());
			
			if(node.getLeftChild() != null){
				traversePreOrder(node.getLeftChild());
			}


			if(node.getRightChild() != null){
				traversePreOrder(node.getRightChild());
			}
		}
	}
	
	private void traversePostOrder(BinaryTreeNode<T> node){
		if(node != null){
			
			
			if(node.getLeftChild() != null){
				traversePostOrder(node.getLeftChild());
			}


			if(node.getRightChild() != null){
				traversePostOrder(node.getRightChild());
			}
			
			System.out.println(node.getNodeData());
		}
	}
}
