package com.learn.ds.queue;

public interface IQueue {

	public void enQueue(Object object);

	public Object deQueue();

	public int size();

	public boolean isEmpty();

}
