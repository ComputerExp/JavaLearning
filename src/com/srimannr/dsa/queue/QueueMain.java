package com.srimannr.dsa.queue;

interface queue {
	int front();
	
	int rear();
	
	boolean isEmpty();
	
	boolean isFull();
	
	void enqueue(int ele);
	
	int dequeue();
	
	void display();
}

class QueueArr implements queue {
	private final int[] arr;
	private final int size;
	private int front;
	private int rear;
	
	public QueueArr(int size) {
		this.size = size;
		this.arr = new int[size];
		this.front = this.rear = -1;
	}
	
	@Override
	public int front() {
		return arr[front];
	}
	
	@Override
	public int rear() {
		return arr[rear];
	}
	
	@Override
	public boolean isEmpty() {
		return (front == rear && rear == -1) || (front > rear);
	}
	
	@Override
	public boolean isFull() {
		return (rear == size - 1);
	}
	
	@Override
	public void enqueue(int ele) {
		if (!isFull()) {
			arr[rear++] = ele;
			if (front == rear && rear == -1) {
				front = 0;
			}
		} else {
			throw new RuntimeException("Queue Overflow");
		}
	}
	
	@Override
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue Underflow");
		}
		return arr[front++];
	}
	
	@Override
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
		} else {
			for (int ele : arr) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
	}
}

class QueueMain {

}