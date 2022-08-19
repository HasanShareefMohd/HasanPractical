package com.java;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args)  {
	Stack<Integer> s=new Stack<>();
	System.out.println("stack:"+s);
	 pushelement(s."15);
	 pushelement(s.25);
	 pushelement(s.35);
	 pushelement(s.45);
	 popelement(s);
	 popelement(s);
	 try {
		popelement(s);
	}
	catch(EmptyStackException e) {
		System.out.println("Stack is empty");
	}}
private static void pushelement(Stack<Integer> s,int i) {
	s.push(new Integer);
	//System.out.println("push element"+x);
		System.out.println("push:"+string);
		System.out.println("push:"+s);
}
		
		private static void popelement(Stack<Integer> s) {
			// TODO Auto-generated method stub
			Integer i=(Integer)s.pop();
			System.out.println("pop:"+i);
			System.out.println("stack:"+s);
			
			
		}

		
	}
	




