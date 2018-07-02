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
	
	private static final double DELTA = 1e-15; 
	 
	 
	 //Triangle tests
	
	 @Test
	 public void testGetTriangleArea(){
	  int a = 3;
	  int b = 4;
	  int c = 5;
	  Assert.assertEquals(6.0 ,(new Triangle(a,b,c)).getArea(), DELTA);
	  System.out.println("a=3, b=4, c=5 Test is successful!");
	 }
	 
	 @Test
	 public void testGetTriangleArea2(){
	  int a = 1;
	  int b = 4;  // This can not be a triangle!
	  int c = 7; 
	  Assert.assertEquals(0.0 , (new Triangle(a,b,c)).getArea(), DELTA);
	  System.out.println("a=1, b=4, c=7 Test is successful!");
	 }
	 @Test
	 public void testGetTriangleArea3(){
	  int a = 3;
	  int b = 3;  // This can not be a triangle!
	  int c = 8; 
	  Assert.assertEquals(0.0 , (new Triangle(a,b,c)).getArea(), DELTA);
	  System.out.println("a=3, b=3, c=8 Test is successful!");
	 }  
	
	
	
	 	//Circle tests
	 
		@Test
		public void testGetCircleArea1() {
			int r = 0;
			Circle circle = new Circle(r);
			double circleArea = circle.getArea();
			Assert.assertEquals(0.0 , circleArea, DELTA);
		}
	
		@Test
		public void testGetCircleArea2() {
			int r = 1;
			Circle circle = new Circle(r);
			double circleArea = circle.getArea();
			Assert.assertEquals(Math.PI, circleArea, DELTA);
		}
	
		@Test
		public void testGetCircleArea3() {
			int r = 5;
			Circle circle = new Circle(r);
			double circleArea = circle.getArea();
			Assert.assertEquals(Math.PI*25, circleArea, DELTA);
		}
	
		@Test
		public void testGetCircleArea5() {
			int r = -1;
			Circle circle = new Circle(r);
			double circleArea = circle.getArea();
			Assert.assertEquals(0.0, circleArea, DELTA);
		}
		
		//Square tests
		
		@Test
		public void testGetSquareArea1() {
			int side = 0;
			Square square = new Square(side);
			double squareArea = square.getArea();
			Assert.assertEquals(0.0 , squareArea, DELTA);
		}
		
		@Test
		public void testGetSquareArea2() {
			int side = 5;
			Square square = new Square(side);
			double squareArea = square.getArea();
			Assert.assertEquals(25.0 , squareArea, DELTA);
		}
		
		@Test
		public void testGetSquareArea3() {
			int side = -1;
			Square square = new Square(side);
			double squareArea = square.getArea();
			Assert.assertEquals(0.0 , squareArea, DELTA);
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
