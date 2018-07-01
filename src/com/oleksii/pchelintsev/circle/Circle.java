package com.oleksii.pchelintsev.circle;

import com.oleksii.pchelintsev.AbstractShape;
import com.oleksii.pchelintsev.Shape;

public class Circle extends AbstractShape{
	private int r;
	
	public Circle(int r){
		this.r = r;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}
	@Override
	public double getArea() {
        return Math.PI*r*r;
	}

	@Override
	public String toString() {
		return String.format("Circle, Radius: %d ", r) ;
	}
}
