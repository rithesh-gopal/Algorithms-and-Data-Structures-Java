package com.rithesh.algorithms.main;

import java.util.Scanner;

import com.rithesh.algorithms.ds.ArrayStackImpl;
import com.rithesh.algorithms.ds.interfaces.IStack;

public class StackMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);        
		System.out.println("Stack Test");
		/* Creating object of class arrayStack */
		IStack stk = new ArrayStackImpl();
		/* Perform Stack Operations */
		char ch;

		try{
			do{
				System.out.println("\nStack Operations");
				System.out.println("1. push");
				System.out.println("2. pop");
				System.out.println("3. peek");
				System.out.println("4. Display elements of Stack");
				System.out.println("5. Get Element by Index");
				System.out.println("6. Remove Element");
				System.out.println("7. Check if element is in stack");
				System.out.println("8. Get array size");
				int choice = scan.nextInt();
				switch (choice)
				{
				case 1 : 
					System.out.println("Enter a element to push");
					try{
						stk.push(scan.next());
					}catch (Exception e){
						System.out.println("Error : " + e.getMessage());
					}                         
					break;
				case 2:
					try{
						stk.pop();
					}catch(Exception e){
						System.out.println("Error : "+e.getMessage());
					}
					break;
				case 3:
					try{
						stk.peek();
					}catch(Exception e){
						System.out.println("Error : "+e.getMessage());
					}
					break;
				case 4:
					try{
						stk.display();
					}catch(Exception e){
						System.out.println("Error : "+e.getMessage());
					}
					break;
				case 5:
					System.out.println("Enter the index");
					try{
						System.out.println(stk.get(scan.nextInt()));
					}catch(Exception e){
						System.out.println("Error : "+e.getMessage());
					}
					break;
				case 6:
					System.out.println("Enter the element to be removed");
					try{
						System.out.println(stk.remove(scan.next()));
					}catch(Exception e){
						System.out.println("Error : "+e.getMessage());
					}
					break;
				case 7:
					System.out.println("Enter the element to to check");
					try{
						System.out.println(stk.contains(scan.next()));
					}catch(Exception e){
						System.out.println("Error : "+e.getMessage());
					}
					break;

				case 8:
					try{
						System.out.println(stk.size());
					}catch(Exception e){
						System.out.println("Error : "+e.getMessage());
					}
					break;
				default : 
					System.out.println("Wrong Entry \n ");
					break;
				}
				System.out.println("\nDo you want to continue (Type y or n) \n");
				ch = scan.next().charAt(0);

			} while (ch == 'Y'|| ch == 'y');   

		}finally{
			scan.close();
		}
	}


}
