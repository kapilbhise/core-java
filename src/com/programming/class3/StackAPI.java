package com.programming.class3;

import java.util.Iterator;
import java.util.Stack;

// LIFO push(top)
// remove from top
public class StackAPI {

	static void showPush(Stack<Integer> st, int x) {
		st.push(x);
		System.out.println(st);
	}
	
	static void showPop(Stack<Integer> st) {
		st.pop();
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st=new Stack<>();
		
		showPush(st,10);
		showPush(st,20);
		showPush(st,30);
		System.out.println(st.peek()); //top of stack
		
		Iterator<Integer> itr= st.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		showPop(st);
		showPop(st);
		showPop(st);
		
//		showPop(st); //Stack is empty

		
	}

}
