package com.learn.ds.queue;

public class MyQueueArrayImpl implements IQueue{

	private Object[] queueArray;
	private int queueMaxLength;
	private int beginIndex = 0;
	private int endIndex = 0;

	public MyQueueArrayImpl(int queueLength) {
		this.queueMaxLength = queueLength;
		queueArray = new Object[queueLength];
	}

	public void enQueue(Object object) {
		if(endIndex == (this.queueMaxLength - 1)){
			System.out.println("Queue Full !!");
		}else{
			this.queueArray[endIndex++] = object;
		}
	}

	public Object deQueue() {
		if(!isEmpty()){
			return this.queueArray[beginIndex++];
		}else{
			System.out.println("Queue Empty !!");
			return null;
		}
	}

	public int size() {
		return endIndex - beginIndex;
	}

	public boolean isEmpty() {
		boolean isEmpty = false;
		if(beginIndex == endIndex){
			isEmpty = true;
		}
		return isEmpty;
	}
	
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer("[");
		if(!isEmpty()){
			for(int i = beginIndex; i < endIndex; i++){
				stringBuffer.append(this.queueArray[i] + ", ");
			}
			stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
		}
		stringBuffer.append("]");
		return stringBuffer.toString();
	}

}
