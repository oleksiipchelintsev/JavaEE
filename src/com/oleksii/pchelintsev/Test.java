package com.oleksii.pchelintsev;

import com.oleksii.pchelintsev.triangles.Triangle;
import com.oleksii.pchelintsev.squares.Square;
import com.oleksii.pchelintsev.circles.Circle;
import com.oleksii.pchelintsev.circles.Point;

public class Test {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3,3,3);
		Square  square = new Square(5);
		Circle circle = new Circle(new Point(0,0), 5);
		
		System.out.println(triangle);
		System.out.println(square);
		System.out.println(circle);
	}
}
