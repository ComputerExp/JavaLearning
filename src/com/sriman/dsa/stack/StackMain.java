package com.sriman.dsa.stack;

import java.util.EmptyStackException;

interface Stack {
	int DEFAULT_SIZE = 100;
	void push(int x);
	int pop();
	int peek();
	boolean isEmpty();
	boolean isFull();
}
class StackArr implements Stack {
	private int top;
	private final int size;
	private final int[] stack;
	public StackArr(){
		this(DEFAULT_SIZE);
	}
	public StackArr(int size){
		if (size <= 0) {
			throw new IllegalArgumentException("Stack size must be greater than 0");
		}
		top = -1;
		this.size = size;
		stack = new int[size];
	}
	@Override
	public void push(int x){
		if(isFull()){
			throw new StackOverflowError();
		}
		stack[++top] = x;
	}
	@Override
	public int pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return stack[top--];
	}
	@Override
	public int peek(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return stack[top];
	}
	@Override
	public boolean isEmpty(){
		return top == -1;
	}
	@Override
	public boolean isFull(){
		return  top == size - 1;
	}
}


public class StackMain {
	public static void main(String[] args) {
		Stack stack = new StackArr(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		try {
			stack.push(5);
		}catch(StackOverflowError e){
			System.out.println("Stack overflow");
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		try {
			System.out.println(stack.pop());//throws runtime error
		}catch(EmptyStackException e){
			System.out.println("Stack is empty\nEmpty Stack Exception thrown");
		}
	}
}
