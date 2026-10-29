package com.srimannr.collegeprg.student;

public class DemoProgram3 {
	public static void main(String[] args) {
		StringDemoProgram obj1 = new StringDemoProgram();
		obj1.fName = "Sriman";
		obj1.lName = "Naarayanan";
		System.out.println(obj1);
	}
}
class StringDemoProgram{
	String fName;
	String lName;
	
	public StringDemoProgram(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public StringDemoProgram() {}
	
	@Override
	public String toString() {
		return "StringDemoProgram{" +
						"fName='" + fName + '\'' +
						", lName='" + lName + '\'' +
						'}';
	}
}

class Laptop{
	String brand;
	double price;
	String processor;
	int ram;
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.brand = "Lenovo";
		laptop.processor = "Ryzen";
		laptop.ram = 24;
		laptop.price = 100000.0;
		System.out.println(laptop);
	}
	
	@Override
	public String toString() {
		return "Laptop{" +
						"brand='" + brand + '\'' +
						", price=" + price +
						", processor='" + processor + '\'' +
						", ram=" + ram +
						'}';
	}
}