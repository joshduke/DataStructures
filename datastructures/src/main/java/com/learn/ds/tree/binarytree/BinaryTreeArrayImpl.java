package com.learn.ds.tree.binarytree;

public class BinaryTreeArrayImpl<T> implements IBinaryTree<T>{

	private Object[] treeArray;
	private int numberOfNodes = 0;

	public BinaryTreeArrayImpl(int size) {
		treeArray = new Object[size];
	}

	public int getNumberOfNodes() {
		return numberOfNodes;
	}

	public void addElement(BinaryTreeNode<T> node) {


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

	private int indexToAddElement(){
		if(this.numberOfNodes == 0){
			return 0;
		}else{
			int nodeIndex = 1;
			int arrayIndex = nodeIndex - 1;
			while(this.treeArray[arrayIndex] != null){

			}
			if(this.treeArray[arrayIndex] == null){
				return arrayIndex;
			}
			else{
				arrayIndex = getLeftIndex(nodeIndex);
				if(this.treeArray[arrayIndex] == null){
					return arrayIndex;
				}
			}
		}
		return 0; // Check this code
	}

	private int getLeftIndex(int rootIndex){
		return rootIndex * 2;
	}

	private int getRightIndex(int rootIndex){
		return (rootIndex * 2) + 1;
	}

	public void addElement(T data) {
		// TODO Auto-generated method stub
		
	}
}
