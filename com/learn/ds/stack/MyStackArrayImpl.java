package com.learn.ds.stack;

public class MyStackArrayImpl implements IStack{

	private Object[] stackArray;
	private int top = -1;
	private int stackMaxSize;


	public MyStackArrayImpl(int stackSize) {
		this.stackMaxSize = stackSize;
		this.stackArray = new Object[stackSize];
	}

	public void push(Object obj) {
		if(top == (stackMaxSize-1)){
			System.out.println("Stack Overflow !!");
			return;
		}
		this.stackArray[++top] = obj;
	}

	public Object pop() {
		if(top == -1){
			System.out.println("Stack Underflow !!");
			return null;
		}
		return stackArray[top--];
	}

	public boolean isEmpty() {
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}

	public int size() {
		return this.top + 1;
	}

	public String toString(){
		StringBuffer stringBuffer = new StringBuffer("[");
		if(this.top != -1){
			for(int i=0; i<this.size(); i++){
				stringBuffer.append(this.stackArray[i] + ", ");
			}
			stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
		}
		stringBuffer.append("]");
		return stringBuffer.toString();
	}

}
