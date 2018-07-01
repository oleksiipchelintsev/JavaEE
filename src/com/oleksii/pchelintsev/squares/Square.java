package com.oleksii.pchelintsev.squares;

import com.oleksii.pchelintsev.AbstractShape;
import com.oleksii.pchelintsev.Shape;

public class Square extends AbstractShape{

	private int side;
	
	public Square(int side){
		this.side = side;
	}
	
	@Override
	public void print() {
		System.out.println(this);
	}

	public double getArea() {
        return side*side;
	}

	@Override
	public String toString() {
		return "Triangle: side: " + side;
	}
}
