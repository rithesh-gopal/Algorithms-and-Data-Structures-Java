package com.rithesh.algorithms.ds.interfaces;

/**
 * <h3>This interface is to declare the basic operations that can be applied on a stack.</h3>
 * 
 * A stack is a Last In First Out abstract data type.<br>
 * 
 * The fundamental operations of stack are :<br>
 * 
 * 
 * <li> Push : Adds an element to the stack.</li>
 * <li> Pop : Removes a top most element from the stack.</li>
 * <li> Peek : Returns the top most element from the stack without removing it.
 * <br>
 * <b>Application of Stack</b><br>
 *<li> Used in Memory Management</li><br>
 * 
 * Stack is used to hold all local variables and parameters used by any function and remembers the order in which functions are called so that function returns occur correctly.
 * <br>
 * 
 * <p>
 * @see <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">Stack (Wikipedia)</a>
 * </p>
 * @author Rithesh
 *
 * @param <T>
 */
/**
 * @author Rithesh
 *
 * @param <T>
 */
/**
 * @author Rithesh
 *
 * @param <T>
 */
public interface IStack<T> {

	
    /**
     * Push value on top of stack
     * 
     * @param value to push on the stack.
     */
    public boolean push(T value);
    

    /**
     * Pop the value from the top of stack.
     * 
     * @return value popped off the top of the stack.
     */
    public T pop();

    /**
     * Peek the value from the top of stack.
     * 
     * @return value popped off the top of the stack.
     */
    public T peek();
    
    
    
    /**
     * Find the element which is present in the specified index
     * 
     * @param index
     * @return The element which is present in the specified index
     */
    public T get(int index);
    
    /**
     * Remove the element specified.
     * 
     * @param elementToRemove
     * @return Boolean flag indicating the status of the operation
     */
    public boolean remove(T elementToRemove);
    
    /**
     * Clear the stack
     */
    public void clear();
    
    
    /**
     * Check if the value is present in the stack
     * 
     * @param value
     * @return true, if the element is present in the Stack
     * 			false, if not
     */
    public boolean contains(T value);
    
    /**
     * @return the size of the array.
     */
    public int size();

    
    /**
     * Displays all the elements of the stack.
     */
    public void display();
    
}
