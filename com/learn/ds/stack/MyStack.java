package com.learn.ds.stack;

import com.learn.ds.list.MyList;

public class MyStack implements IStack{

	MyList list = new MyList();
	int size = 0;

	public void push(Object obj) {
		this.list.addObject(obj);
		this.size++;
	}

	public Object pop() {
		return this.list.getLastNode();
	}

	public boolean isEmpty() {
		boolean isEmpty = false;
		if(this.size == 0)
			isEmpty = true;
		return isEmpty;
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}


}
