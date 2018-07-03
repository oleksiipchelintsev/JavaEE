package com.oleksii.pchelintsev.lib;

public class Palindrom {
	public int getMaxPalindrom() {
		int suspectedNumber = 0;
		for(int i=9999; i>999; i--) {
			for(int j=9999; j>999; j--) {
				suspectedNumber=i*j;
				String tempString = String.valueOf(suspectedNumber);
				if(tempString.length()%2==0) { //our number has multiple number of numbers
					String firstPart = tempString.substring(0, tempString.length()/2);
					String secondPart = new StringBuffer(tempString.substring(tempString.length()/2)).reverse().toString();
					
					if(firstPart.equals(secondPart)) {
						return suspectedNumber;
					}
				} else {						//our number has non-repetitive number of numbers
					String firstPart = tempString.substring(0, tempString.length()/2);
					String secondPart = new StringBuffer(tempString.substring((tempString.length()/2)+1)).reverse().toString();
					if(firstPart.equals(secondPart)) {
						return suspectedNumber;
					}
				}
			}
		}
		return suspectedNumber;
	}
}
