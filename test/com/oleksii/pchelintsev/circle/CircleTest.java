package com.oleksii.pchelintsev.circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CircleTest {

	@Test
	void testGetAreaZeroData() {
		int r = 0;
		Circle circle = new Circle(r);
		double circleArea = circle.getArea();
		Assert.assertEquals(0, (int) circleArea);
	}
	
	@Test
	void testGetAreaNormalData() {
		int r = 5;
		Circle circle = new Circle(r);
		double circleArea = circle.getArea();
		Assert.assertEquals(Math.PI*25, circleArea);
	}
	
	@Test
	void testGetAreaNegativeData() {
		int r = -1;
		Circle circle = new Circle(r);
		double circleArea = circle.getArea();
		Assert.assertEquals(0, (int)circleArea);
	}
}