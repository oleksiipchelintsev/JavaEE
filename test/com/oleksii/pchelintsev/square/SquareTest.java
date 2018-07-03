package com.oleksii.pchelintsev.square;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SquareTest {

	@Test
	public void testGetAreaNormalData() {
		int side = 5;
		Square square = new Square(side);
		double squareArea = square.getArea();
		Assert.assertEquals(25, (int)squareArea);
	}
	
	@Test
	public void testGetAreaZeroData() {
		int side = 0;
		Square square = new Square(side);
		double squareArea = square.getArea();
		Assert.assertEquals(0,(int)squareArea);
	}
	
	@Test
	public void testGetAreaNegativeData() {
		int side = -1;
		Square square = new Square(side);
		double squareArea = square.getArea();
		Assert.assertEquals(0,(int)squareArea);
	}
}