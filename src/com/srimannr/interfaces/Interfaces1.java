package com.srimannr.interfaces;

interface polygon{
	double PI = 3.14159265358979;
	float area();
	float perimeter();
}

class rectangle implements polygon{
	private final float[] sides = new float[2];
	
	public rectangle(float width,float height) {
		this.sides[0] = width;
		this.sides[1] = height;
	}
	public rectangle(){
		this.sides[0] = 0;
		this.sides[1] = 0;
	}
	
	@Override
	public float area(){
		return sides[0]*sides[1];
	}
	
	@Override
	public float perimeter() {
		return sides[0] + sides[1];
	}
	
}
public class Interfaces1 {
	public static void main(String[] args) {
		rectangle rect = new rectangle(2,3);
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
	}
}
