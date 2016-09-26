package com.learn.ds.list;

public interface IList {

	public void addObject(Object obj);

	public void addObject(Object obj, int index);

	public int getObject(Object obj);

	public Node getObject(int index);

	public void removeObject(Object obj);

	public void removeObject(int index);

	public boolean isEmpty();

	public int size();

}
