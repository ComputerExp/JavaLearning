package com.srimannr.abstractclasses;

abstract class Graphic{
	public int x1, y1, x2, y2;
	public void setStart(int x1, int y1){
		this.x1 = x1;
		this.y1 = y1;
	}
	public void setEnd(int x2, int y2){
		this.x2 = x2;
		this.y2 = y2;
	}
	public abstract void draw();
}

class Line extends Graphic{
	
	@Override
	public void draw() {
		System.out.printf("Draw line from (%d,%d) to (%d,%d)\n",x1,y1,x2,y2);
	}
}
class Rectangle extends Graphic{
	
	@Override
	public void draw() {
		System.out.printf("Draw rectangle from (%d,%d) to (%d,%d)\n",x1,y1,x2,y2);
	}
}

public class AbstractClassExercise {

}
