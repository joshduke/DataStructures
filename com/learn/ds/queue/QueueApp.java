package com.learn.ds.queue;

public class QueueApp {

	public static void main(String[] args) {
		IQueue iQueue = new MyQueueLinkedListImpl();
		iQueue.enQueue("Josh");
		
		iQueue.enQueue("Duke");
		iQueue.enQueue("Williams");
		iQueue.enQueue("Jebaraj");
		iQueue.enQueue("Maydurai");
		iQueue.enQueue("Sam");
		iQueue.enQueue("Williams");
		iQueue.enQueue("Esther Jebaraj");
		iQueue.enQueue("1");
		iQueue.enQueue("345");
		
		System.out.println(iQueue);
		
		iQueue.deQueue();
		System.out.println(iQueue);
		
		iQueue.deQueue();
		iQueue.deQueue();
		iQueue.deQueue();
		iQueue.deQueue();
		System.out.println(iQueue);
	}

}
