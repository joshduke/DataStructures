package com.learn.ds.stack;

import com.learn.ds.list.MyList;
import com.learn.ds.list.Node;

public class MyStackLinkedListImpl implements IStack{

	private MyList list = new MyList();
	private int top = 0;
	public void push(Object obj) {
		list.addObject(obj);
		top = list.size();
	}

	public Object pop() {
		if(list.size() > 0){
			Node lastNode = this.list.getLastNode();
			list.removeObject(this.list.size() - 1);
			top = list.size();
			System.out.println("Element " + lastNode + " is poped --");
			return lastNode;
		}else{
			System.out.println("Stack Underflow !!");
			return null;
		}

	}

	public boolean isEmpty() {
		boolean isEmpty = true;
		if(list.size() > 0)
			isEmpty = false;
		return isEmpty;
	}

	public int size() {
		return this.list.size();
	}

	public String toString(){
		return this.list.toString();
	}

}
