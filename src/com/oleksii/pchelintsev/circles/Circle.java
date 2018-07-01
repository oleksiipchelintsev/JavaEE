package com.oleksii.pchelintsev.circles;

import com.oleksii.pchelintsev.AbstractShape;
import com.oleksii.pchelintsev.Shape;

public class Circle extends AbstractShape{
	private Point point;
	private int r;
	
	public Circle(Point point, int r){
		this.point = point;
		this.r = r;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}

	public double getArea() {
        return Math.PI*r*r;
	}

	@Override
	public String toString() {
		return String.format("Circle (%d,%d), Radius: %d ", point.getX(), point.getY(), r) ;
	}
}
