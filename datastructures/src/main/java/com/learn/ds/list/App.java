package com.learn.ds.list;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	MyList list = new MyList();
    	list.addObject("Josh");
    	list.addObject("Duke");
    	list.addObject("Williams");
    	list.addObject("Middle Name", 1);
    	System.out.println(list.size());
    	System.out.println(list);
    	list.addObject("Sam Williams", 5);
    	System.out.println(list);
    	list.removeObject(2);
    	
    	System.out.println(list);
    	
    	/*for(int i = 0; i<list.size(); i++){
    		System.out.println(list.getObject(i));
    	}*/
/*    	list.removeObject(1);
    	list.removeObject(0);
    	System.out.println(list.size());
    	for(int i = 0; i<list.size(); i++){
    		System.out.println(list.getObject(i));
    	}*/
    }
}
