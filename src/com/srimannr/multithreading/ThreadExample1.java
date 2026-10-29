package com.srimannr.multithreading;

public class ThreadExample1 {
	public static class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("MyThread running");
		}
	}
	
	static void main() {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.start();
		thread2.start();
	}
}
