package com.rithesh.ds.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.rithesh.algorithms.ds.ArrayStackImpl;
import com.rithesh.algorithms.ds.interfaces.IStack;

@SuppressWarnings("unchecked")
public class StackTests {

	private IStack stack = null;
	
	
	@Before
	public void initialize(){
		stack = new ArrayStackImpl();
	}
	
	@Test
	public void pushTest(){
		assertEquals(stack.push("Rithesh"),true);
	}
	
	@Test
	public void popTest(){
		stack.push("Rithesh");
		stack.push(1);
		assertEquals(stack.pop(),1);
	}
	
	@Test
	public void peekTest(){
		stack.push("Rithesh");
		stack.push(1);
		assertEquals(stack.peek(),1);
	}
	
	@Test
	public void getTest(){
		stack.push("Rithesh");
		stack.push(1);
		assertEquals(stack.get(1),1);
	}
	
	
	@Test
	public void removeTest(){
		stack.push("Rithesh");
		stack.push(1);
		assertEquals(stack.remove(1),true);
	}
	
	@Test
	public void containsTest(){
		stack.push("Rithesh");
		stack.push(1);
		assertEquals(stack.contains(1),true);
	}
	
}
