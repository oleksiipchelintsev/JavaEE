package com.oleksii.pchelontsev.lib;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.oleksii.pchelintsev.lib.CountSum;

import junit.framework.Assert;

class CountSumTest {

	@Test
	void testSumNumbersStringNormal() {
		  String number = "12345"; 
		  Assert.assertEquals(15,(new CountSum().sumNumbers(number)));
		  System.out.println("number = 12345, Test is successful!");
	}
	
	@Test
	void testSumNumbersStringNotANumber() {			//Exception NumberFormatException
		  assertThrows(NumberFormatException.class, ()->{
			  String number = "AAAA";
			  new CountSum().sumNumbers(number);
			  System.out.println(new CountSum().sumNumbers(number));
		  }, "a message");
		  
		  System.out.println("number = 12345, Test is successful!");
	}
	
	@Test
	void testSumNumbersStringEmptyString() {		//Exception
		  String number = ""; 
		  Assert.assertEquals(0,(new CountSum().sumNumbers(number)));
		  System.out.println("number = \"\", Test is successful!");
	}
	
	@Test
	void testSumNumbersStringNull() {				//Exception NullPointerException
		assertThrows(NullPointerException.class, ()->{
			  String number = null;
			  new CountSum().sumNumbers(number);
		  }, "a message");
		  System.out.println("number = null, Test is successful!");
	}
	
	@Test
	void testSumNumbersStringZeroNumber() {			//0
		  String number = "0"; 
		  Assert.assertEquals(0,(new CountSum().sumNumbers(number)));
		  System.out.println("number = 0, Test is successful!");
	}
	
	
	
	@Test
	void testSumNumbersIntPositive() {
		  int number = 15; 
		  Assert.assertEquals(6,(new CountSum().sumNumbers(number)));
		  System.out.println("number = 15, Test is successful!");
	}
	@Test
	void testSumNumbersIntNegative() {
		  int number = -12345; 
		  Assert.assertEquals(15,(new CountSum().sumNumbers(number)));
		  System.out.println("number = -12345, Test is successful!");
	}
	@Test
	void testSumNumbersIntZero() {
		  int number = 0; 
		  Assert.assertEquals(0,(new CountSum().sumNumbers(number)));
		  System.out.println("number = 0, Test is successful!");
	}
}
