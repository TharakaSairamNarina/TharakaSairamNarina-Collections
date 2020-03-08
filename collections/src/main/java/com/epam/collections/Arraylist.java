package com.epam.collections;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Arraylist<E> {
	public static final Logger logger = LogManager.getLogger(App.class);
	private int size=0;
	private static int capacity=10;
	private Object element[];
	public Arraylist() {
		element=new Object[capacity];
	}
	public void addElement(E e) {
		if(size==element.length) {
			increaseSize();
		}
		element[size++]=e;
	}
	private void increaseSize() {
		int newsize=element.length*2;
		element=Arrays.copyOf(element, newsize);
	}

	@SuppressWarnings("unchecked")
	public E getElement(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		else {
			return (E) element[i];
		}
	}
	
	@SuppressWarnings("unchecked")
	public E delete(int i) {
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException("Index out of range");
		}
		Object x=element[i];
		for(int k=i;k<size;k++) {
			element[i]=element[i+1];
		}
		size--;
		return (E)x;
	}
	public void print() {
		logger.info("List is :");
		for(int i=0;i<size;i++) {
			logger.info(element[i]+" ");
		}
	}
}