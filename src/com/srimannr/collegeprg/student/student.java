package com.srimannr.collegeprg.student;

import java.util.Scanner;

public class student {
	
	public static float[] createMarksArray(int size) {
		float[] marksArray = new float[size];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < size; ++i) {
			System.out.printf("Subject %d = ", i + 1);
			marksArray[i] = (float)in.nextInt();
		}
		
		in.close();
		return marksArray;
	}
	
	public static void printMarksArray(float[] arr) {
		System.out.println("The elements of the marks array is");
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.println("Marks for subject " + (i + 1) + " is " + arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Starting marks program");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int size = in.nextInt();
		float[] marks = createMarksArray(size);
		printMarksArray(marks);
	}
}
