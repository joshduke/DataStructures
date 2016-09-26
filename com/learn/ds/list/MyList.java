package com.learn.ds.list;


/*
		This is my implementation for the Linked List concept.
 */

public class MyList implements IList{

	private Node headNode;
	private int size = 0;

	public MyList() {
		this.size = 0;
	}


	public void addObject(Object obj, int index) {

		if(index == 0){ // Head position
			Node newHeadNode = new Node();
			newHeadNode.setObject(obj);
			if(!isEmpty()){
				newHeadNode.setNext(headNode);
			}
			headNode = newHeadNode;
			this.size++;
		}else if(index >= this.size){ // tail position
			System.out.println("-- Invalid Index Requested -- Adding the object to end of list");
			addToEnd(obj);
		}else{ // intermediate position
			Node newNode = new Node();
			newNode.setObject(obj);
			int nodePtr = 0;
			Node currentNode = headNode;
			while(currentNode.getNext() != null){
				nodePtr++;
				if(nodePtr == index){
					newNode.setNext(currentNode.getNext());
					currentNode.setNext(newNode);
					this.size++;
				}else{
					currentNode = currentNode.getNext();
				}
			}
		}

	}

	public void addToEnd(Object object){
		Node newNode = new Node();
		newNode.setObject(object);
		Node currentNode = headNode;
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(newNode);
		this.size++;
	}


	public int getObject(Object obj) {
		int nodeIndex = -1;
		if(!isEmpty()){
			if(this.size == 1 && headNode.getObject().equals(obj)){
				return 0;
			}else{
				Node currentNode = headNode;
				while(currentNode.getNext() != null){
					nodeIndex++;
					if(currentNode.getObject().equals(obj)){
						return nodeIndex;
					}
				}
			}
		}
		return nodeIndex;
	}

	public Node getObject(int index) {

		if(index >= this.size){
			return null;
		}else{
			if(isEmpty()){
				return null;
			}else{
				if(index == 0){
					return headNode;
				}else{
					int itrCount = 0;
					Node node = headNode;
					while(node.getNext() != null && itrCount != index){
						node = node.getNext();
						itrCount++;
					}
					return node;
				}
			}
		}
	}

	public void removeObject(Object obj) {
		int index = getObject(obj);
		removeObject(index);
	}

	public void removeObject(int index) {
		if(index >= this.size){
			System.out.println("Invalid Index");
		}else{
			if(this.size == 1 && index == 0){
				this.headNode = null;
				this.size--;
			}
			else if(index == (this.size - 1)){
				Node node = this.getLastNode();
				node = null;
				this.size--;
			}
			else{
				int itrCount = 0;
				if(index == 0){
					Node nodeToRemove = headNode;
					Node nodeToShift = nodeToRemove.getNext();
					nodeToRemove = null;
					headNode = nodeToShift;
					this.size--;
				}else{
					Node currentNode = headNode;
					while(currentNode.getNext() != null){
						if(itrCount + 1 == index){
							Node nodeToRemove = currentNode.getNext();
							Node nodeToShift = nodeToRemove.getNext();
							nodeToRemove = null;
							currentNode.setNext(nodeToShift);
							this.size--;
							break;
						}
						currentNode = currentNode.getNext();
						itrCount++;
					}
				}
			}
		}
	}

	public boolean isEmpty() {
		if(this.size == 0){
			return true;
		}else{
			return false;
		}  
	}

	public int size() {
		return this.size;
	}

	public void addObject(Object obj) {
		if(isEmpty()){
			headNode = new Node();
			headNode.setObject(obj);
			headNode.setNext(null);
		}else{
			Node newNode = new Node();
			newNode.setObject(obj);
			Node node = getLastNode();
			node.setNext(newNode);
			newNode.setNext(null);
		}
		this.size++;
	}

	private Node getNode(int index){
		if(isEmpty() || index < 0 || index >= this.size){
			return null;
		}
		return null;
	}

	public Node getLastNode(){
		if(isEmpty()){
			return null;
		}
		Node node = headNode;
		while(node.getNext() != null){
			node = node.getNext();
		}
		return node;
	}

	public Node getFirstNode(){
		return this.headNode;
	}

	@Override
	public String toString() {
		if(headNode != null){
			Node currentNode = headNode;
			StringBuffer stringBuffer = new StringBuffer("[");
			while(currentNode.getNext() != null){
				stringBuffer.append(currentNode.getObject() + ", ");
				currentNode = currentNode.getNext();
			}
			stringBuffer.append(currentNode.getObject());
			stringBuffer.append("]");
			return stringBuffer.toString();
		}else{
			return "[ ]";
		}
	}

}
