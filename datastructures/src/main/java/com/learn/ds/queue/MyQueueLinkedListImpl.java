package com.learn.ds.queue;

import com.learn.ds.list.MyList;
import com.learn.ds.list.Node;

public class MyQueueLinkedListImpl implements IQueue{

	private MyList list = new MyList();

	public void enQueue(Object object) {
		list.addObject(object);
	}

	public Object deQueue() {
		Node frontNode = this.list.getObject(0);
		this.list.removeObject(0);
		return frontNode;
	}

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		if(this.list.size() == 0){
			return true;
		}else{
			return false;
		}
	}

	public String toString(){
		return this.list.toString();
	}

}
