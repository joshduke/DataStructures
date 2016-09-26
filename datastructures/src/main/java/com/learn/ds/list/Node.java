package com.learn.ds.list;

public class Node {

	private Node next;
	private Object object;

	public void setNext(Node next) {
		this.next = next;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Node getNext() {
		return next;
	}

	public Object getObject() {
		return object;
	}
	
	public String toString(){
		return this.object + "";
	}

}
