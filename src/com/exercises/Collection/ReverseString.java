package com.exercises.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

class MyStack<T> {
	
	private LinkedList<T> myStack = new LinkedList<T>();
	
	public void push(T t){
		myStack.addFirst(t);
	}
	public T peek(){
		return myStack.peekFirst();
	}
	public T pop(){
		return myStack.removeFirst();
	}
}

public class ReverseString {
	
	public static void main(String[] args){
		
		MyStack<String> stack = new MyStack<>();
		String myString = "Twinkle Twinkle little star, how I wonder what you are. Up above the whorlds so high. Like a Diamond in the sky";
		
		for (String s : myString.split(" ")){
			stack.push(s);
		}
		while (stack.peek() != null){
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println("Now do it using stack");
		Stack<String> javaStack = new Stack<>();
		for (String s : myString.split(" ")) {
			javaStack.push(s);			
		}
		
		try {
			while (javaStack.peek() != null){
				System.out.print(" " + javaStack.pop());
			}
		}
		catch (EmptyStackException e) {
			System.out.println("");
		}
		
	}

}
