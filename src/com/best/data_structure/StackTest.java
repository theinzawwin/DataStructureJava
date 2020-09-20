package com.best.data_structure;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

	static void showpush(Stack st,int dat) {
		st.push(new Integer(dat));
		System.out.println("push("+dat+")");
		System.out.println("stack: "+st);
	}
	static void showpop(Stack st) {
		System.out.println("pop -> ");
		Integer a=(Integer)st.pop();
		System.out.println(a);
		System.out.println("stack: "+st);
	}
	public static void main(String[] args) {
		Stack st=new Stack();
		System.out.println("stack: "+st);
		showpush(st,25);
		showpush(st,45);
		showpush(st,99);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
				
			}catch(EmptyStackException e) {
				System.out.println("empty stack");
		}
	}
}
