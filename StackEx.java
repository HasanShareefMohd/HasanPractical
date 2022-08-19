package com.java;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args)  {
		Stack<Integer> s=new Stack<>();
		boolean result= s.empty();
		System.out.println("is the stack empty ?"+result);
		s.push(25);
		s.push(35);
		s.push(45);
		s.push(55);
		s.push(65);
		s.push(75);
		//pushelement(s,15);
		//popelement(s);
		try {
			popelement(s);
		}
		catch(EmptyStackException e) {
			System.out.println("Stack is empty");
		}
		System.out.println("elements are:"+s);
		result=s.empty();
		System.out.println("is the stack empty ?"+result);
		
	}

	private static void popelement(Stack<Integer> s) {
		// TODO Auto-generated method stub
		
	}
	


	}
		
	


