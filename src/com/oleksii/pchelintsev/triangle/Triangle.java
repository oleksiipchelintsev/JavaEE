package com.oleksii.pchelintsev.triangle;

import com.oleksii.pchelintsev.AbstractShape;
import com.oleksii.pchelintsev.Shape;

public class Triangle extends AbstractShape{
	private int sideA;
	private int sideB;
	private int sideC;
	
	public Triangle(int a, int b, int c){
		this.sideA = a;
		this.sideB = b;
		this.sideC = c;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}
	@Override
	public double getArea() {
		double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	@Override
	public String toString() {
		return "Triangle: side_A: " + sideA +
						 " side_B: " + sideB +
						 " side_C: " + sideC;
	}
}
