package com.srimannr.collegeprg.student;
import java.util.Scanner;

public class student2 {
	private String name;
	private String usn;
	
	public student2(String name, String usn){
		this.name = name;
		this.usn = usn;
	}
	public student2(){}
	
	public String getUsn() {
		return usn;
	}
	
	public void setUsn(String usn) {
		this.usn = usn;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "student2{" +
						"name='" + name + '\'' +
						", usn='" + usn + '\'' +
						'}';
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		student2[] SArray = new student2[3];
		
		Scanner scan = new Scanner(System.in);
		
	}
}
