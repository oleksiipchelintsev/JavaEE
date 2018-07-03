package com.oleksii.pchelintsev.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TriangleTest {

	@Test
	void testGetAreaNormal() {
		  int a = 3;
		  int b = 4;
		  int c = 5;
		  Assert.assertEquals(6,(int)(new Triangle(a,b,c)).getArea());
		  System.out.println("a=3, b=4, c=5 Test is successful!");
	}
	
	@Test
	void testGetAreaUnrealTriangle() {
		  int a = 1;
		  int b = 4;  // This can not be a triangle!
		  int c = 7; 
		  Assert.assertEquals(0,(int)(new Triangle(a,b,c)).getArea());
		  System.out.println("a=1, b=4, c=7 Test is successful!");
	}
	
	
	@Test
	void testGetAreaZeroTriangle() {
		  int a = 0;
		  int b = 0;  // This can not be a triangle!
		  int c = 0; 
		  Assert.assertEquals(0,(int)(new Triangle(a,b,c)).getArea());
		  System.out.println("a=0, b=0, c=0 Test is successful!");
	} 
}
