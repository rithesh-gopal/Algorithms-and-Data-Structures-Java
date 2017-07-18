package com.rithesh.algorithms.ds;

import java.util.Arrays;

import com.rithesh.algorithms.ds.interfaces.IStack;

/**
 * <h3>This class implements the basic operations that can be applied on a stack.</h3>
 * 
 * @author Rithesh
 *
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class ArrayStackImpl<T> implements IStack<T>{

	private static final int MINIMUM_SIZE = 1024;
	private T[] array = (T[]) new Object[MINIMUM_SIZE];
	private int size = 0;
	
	
	/* (non-Javadoc)
	 * @see com.rithesh.algorithms.ds.interfaces.IStack#push(java.lang.Object)
	 */
	@Override
	public boolean push(T value) {
		if(size>array.length)
			grow();
		array[size++] = value;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see com.rithesh.algorithms.ds.interfaces.IStack#pop()
	 */
	@Override
	public T pop() {
		if(size<=0)
			return null;
		T elementToRemove = array[--size];
		array[size] = null;
		int shrinkSize = array.length >>1 ;
		
		if(shrinkSize >= MINIMUM_SIZE && size < shrinkSize)
			shrink(shrinkSize);
		
		return elementToRemove;
	}

	/* (non-Javadoc)
	 * @see com.rithesh.algorithms.ds.interfaces.IStack#peek()
	 */
	@Override
	public T peek() {
		if(size <= 0)
			return null;
		T topElement = array[--size];
		return topElement;
	}

	/* (non-Javadoc)
	 * @see com.rithesh.algorithms.ds.interfaces.IStack#get(int)
	 */
	@Override
	public T get(int index) {
		if(index>=0 && index<size)
			return array[index];
		return null;
	}

	@Override
	public boolean remove(T elementToRemove) {
		for(int i=0;i<size; i++){
			T obj = array[i];
			
			if(obj.equals(elementToRemove)){
				return remove(i);
			}
		}
		return false;
	}

	private boolean remove(int index) {
		if(index!=--size){
			System.arraycopy(array, index+1, array, index, size-index);
		}
		array[size]=null;
		
		int shrinkSize = array.length >> 1;
		if(shrinkSize>= MINIMUM_SIZE && shrinkSize >= size)
			shrink(shrinkSize);
		return true;
	}

	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public boolean contains(T value) {

		for(int i=0;i<size;i++){
			T element = array[i];
			if(element.equals(value)){
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	
	

	// Grow the array by 50%
	private void grow() {
		int growSize = size << 2;
		array = Arrays.copyOf(array, growSize);
	}
	//Shrink the array by 50%
	private void shrink(int shrinkSize){
		array = Arrays.copyOf(array, shrinkSize);
	}

	@Override
	public void display() {
		for(int i=0;i<size;i++){
			System.out.println(i+" --> " +array[i]);
		}
	}

}
