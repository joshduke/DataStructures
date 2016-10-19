package com.learn.ds.tree.binarytree;

public class BinaryTreeLinkedListImpl<T> implements IBinaryTree<T>{

	private BinaryTreeNode<T> rootNode;

	public void addData(T data){
		if(this.rootNode == null){
			rootNode = addToTree(rootNode, data);
		}else{
			addToTree(rootNode, data);
		}
	}

	private BinaryTreeNode<T> addToTree(BinaryTreeNode<T> rootNode, T data){
		BinaryTreeNode<T> node = null;
		if(rootNode == null){
			node = new BinaryTreeNode<T>(data);
			return node;
		}else{
			while(true){
				if(rootNode.getLeftChild() == null){
					rootNode.setLeftChild(addToTree(rootNode.getLeftChild(), data));
					break;
				}else if(rootNode.getRightChild() == null){
					rootNode.setRightChild(addToTree(rootNode.getRightChild(), data));
					break;
				}else{
					rootNode = rootNode.getLeftChild();
				}
			}
			return node;
		}
	}


	public void addElement(BinaryTreeNode<T> node) {
		// TODO Auto-generated method stub

	}

	public void removeElement(BinaryTreeNode<T> node) {
		// TODO Auto-generated method stub

	}

	public void removeElement(int index) {
		// TODO Auto-generated method stub

	}

	public BinaryTreeNode<T> getElement(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		BinaryTreeNode<T> currentNode;
		currentNode = this.rootNode;
		boolean leftNodeVisited = false;
		boolean rightNodeVisited = false;
		stringBuffer.append(currentNode.getNodeData().toString());
		while(currentNode != null){
			if(leftNodeVisited && !rightNodeVisited && currentNode.getRightChild() != null){
				rightNodeVisited = true;
				leftNodeVisited = false;
				stringBuffer.append(currentNode.getRightChild().toString());
				continue;
			}else if(!leftNodeVisited && rightNodeVisited && currentNode.getLeftChild() != null){
				rightNodeVisited = false;
				leftNodeVisited = true;
				stringBuffer.append(currentNode.getLeftChild().toString());
				continue;
			}else{
				currentNode = currentNode.getLeftChild();
				leftNodeVisited = true;
				continue;
			}
		}
		return stringBuffer.toString();
	}

	public void addElement(T data) {
		// TODO Auto-generated method stub

	}

	public void printElements(){
		BinaryTreeTraversal<T> treeTraversal = new BinaryTreeTraversal<T>(this.rootNode);
//		treeTraversal.performInOrderTraversal();
//		treeTraversal.performPreOrderTraversal();
		treeTraversal.performPostOrderTraversal();
	}

}
