package com.oleksii.pchelintsev.circles;

import com.oleksii.pchelintsev.Shape;

public class Point implements Shape {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Point X="+ x + " Y="+ y;
	}
			
}
