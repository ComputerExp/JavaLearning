package com.srimannr.workshop;

public class File1 {
	public static void main(String[] args) {
		Student1 S1 = new Student1("Sriman",100.0f);
		Student1 S2 = new Student1("Rahul",90.0f);
		
		S1.show();
		S2.show();
	}
}

class Student1 {
	String name;
	float marks;
	
	public Student1(String name, float marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public void show(){
		System.out.println(name);
		System.out.println(marks);
	}
}
