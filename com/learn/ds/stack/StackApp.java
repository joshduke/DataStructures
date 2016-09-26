package com.learn.ds.stack;

public class StackApp {

	public static void main(String[] args) {

		
//		IStack iStack = new MyStackArrayImpl(10);
		IStack iStack = new MyStackLinkedListImpl();
		iStack.push("Josh");
		iStack.push("Duke");
		iStack.push("Williams");
		
		System.out.println(iStack);
		iStack.pop();
		iStack.pop();
		iStack.pop();
		iStack.pop();
		iStack.pop();
		System.out.println(iStack);
	}

}
