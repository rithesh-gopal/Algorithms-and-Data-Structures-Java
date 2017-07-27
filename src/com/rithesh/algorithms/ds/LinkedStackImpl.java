package com.rithesh.algorithms.ds;

import com.rithesh.algorithms.ds.interfaces.IStack;

@SuppressWarnings("unchecked")
public class LinkedStackImpl<T> implements IStack<T>{

	  private Node<T> top;
      private int size;

      public LinkedStackImpl() {
          top = null;
          size = 0;
      }
	
	private static class Node<T>{
		private T value = null;
		private Node<T> next = null;
		private Node<T> previous = null;
		
		private Node(T value){
			this.value = value;
		}
		
		@Override
		public String toString(){
			return "value="+ value +" above = "+((next!=null) ? next.value : "Null") +
					" below = "+((previous!=null) ? previous.value : "Null");
		}
		
	}

	@Override
	public boolean push(T value) {
		return push(new Node(value));
	}
	
	private boolean push(Node node){
		if(top == null)
			top = node;
		else{
			Node<T> oldTop = top;
			top = node;
			top.previous = oldTop;
			oldTop.next = top;
		}
		size++;
		return true;
	}
	
	
	

	@Override
	public T pop() {
		if(top == null) return null;
		Node<T> nodeToRemove = top;
		top = nodeToRemove.previous;
		if(top!=null)
			top.next = null;
		size--;
		T value = nodeToRemove.value;
		return value;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T elementToRemove) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override 
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
