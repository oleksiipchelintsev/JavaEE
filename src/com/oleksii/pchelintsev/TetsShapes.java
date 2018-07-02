package com.oleksii.pchelintsev;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import com.oleksii.pchelintsev.circle.Circle;
import com.oleksii.pchelintsev.square.Square;
import com.oleksii.pchelintsev.triangle.Triangle;

import junit.framework.Assert;

public class TetsShapes {
		
	@Rule 
	public final Timeout time = new Timeout(1000);
	
	@Test
	public void testTriangleArea() {
		Triangle triangle = new Triangle(3, 4, 5);
		double triangleArea = triangle.getArea();
		Assert.assertTrue(triangleArea == 6);
	}
	@Test
	public void testCircleArea() {
		Circle circle = new Circle(5);
		double circleArea = circle.getArea();
		Assert.assertTrue(circleArea == 25*Math.PI);
	}
	@Test
	public void testSquareArea() {
		Square square = new Square(5);
		double squareArea = square.getArea();
		Assert.assertTrue(squareArea == 25);
	}
	
	
	
//	@Test (expected=Exception.class)
//	public void testAreaException() {
//		Triangle triangle = new Triangle(3, 4, 5);
//		triangle.getArea();
//	}
	
//	@Before
//	public void runingBeforeTests() {
//		System.out.println("Hello it's me before test");
//	}
	
//	@After
//	public void runingAfterTests() {
//		System.out.println("Hello it's me after test");
//	}
//	
//	@BeforeClass
//	public static void runingBeforeAllTests() {
//		System.out.println("Hello it's me before  all test");
//	}
//	
//	@AfterClass
//	public static void runingAfterAllTests() {
//		System.out.println("Hello it's me after all test");
//	}
	
	/*
	 * Using asserFalse
	 */
//	@Ignore
//	@Test
//	public void testTriangleFalseArea() {
//		Triangle triangle = new Triangle(3, 4, 5);
//		double triangleArea = triangle.getArea();
//		Assert.assertFalse(triangleArea == 10);			//has to be false
//		Assert.assertNotNull(triangleArea);				//null checking
//		Assert.assertEquals(6.0, triangleArea);			//checking by method equals
//		Assert.assertNotSame(7.0, triangleArea);		//shoud be not same
//	}
	
	/*
	 * Using assertTrue
	 */
//	@Test
//	public void testTriangleTrueArea() {
//		Triangle triangle = new Triangle(3, 4, 5);
//		double triangleArea = triangle.getArea();
//		Assert.assertTrue(triangleArea == 6);			//has to be true
//		try {
//			triangle.getArea();
//			Assert.fail();								//has Exception been???
//		} catch(Exception e) {
//			
//		}
//	}
	
//	@Test
//	public void testN(){
//		long i = 2;
//		long j = 2;
//		while(i<1_539_000_00) {
//			j=2;
//			while(j<1_000_000_000) {
//					j*=2;
//					j++;
//			}
//			i++;
//		}
//	}
	
}
