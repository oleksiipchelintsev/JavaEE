package com.oleksii.pchelintsev.lib;

public class CountSum {
	public int sumNumbers(String str) {
		int accum = 0;
		char[] strArr = str.toCharArray();
		for(int i = 0; i<strArr.length; i++) {
			accum+=Integer.parseInt(strArr[i]+"");
		}
		return accum;
	}
	
	public int sumNumbers(int number) {
		number = Math.abs(number);
		int sum = 0;
		while (number!=0) {
			sum+=number%10;
			number/=10;
		}
		return sum;
	}
}
