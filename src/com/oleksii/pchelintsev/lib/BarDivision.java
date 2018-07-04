package com.oleksii.pchelintsev.lib;

import java.util.ArrayList;
import java.util.List;

public class BarDivision {
	
	static class DeclaredLine{
		static int maxLenght;
		String string;
		int spacesBefore;
		boolean isLineBefore;
		
		public DeclaredLine(String string, int spacesBefore, boolean isLineBefore) {
			this.string = string;
			this.spacesBefore = spacesBefore;
			this.isLineBefore = isLineBefore;
		}
		
		public void showLine() {
			if(isLineBefore) {
			StringBuilder strBuilder = new StringBuilder();
			int spacesLenght = string.length();
				while(spacesLenght!=0) {
					strBuilder.append("-");
					spacesLenght--;
				}
					String format = spacesBefore == 0 ? "%s\n" : "%"+spacesBefore+"s\n";
					System.out.printf(format,strBuilder.toString());
					System.out.printf(format,string);
				
				
			} else {
				String format = "%"+spacesBefore+"s\n";
				System.out.printf(format,string);
			}
		}
	}
	
	
	public void multiplication(int a, int b) {
		//get some constrant data
		String aStr = String.valueOf(a);
		String bStr = String.valueOf(b);
		int maxLineLenght = (String.valueOf(a*b).length()) > 1 ? (String.valueOf(a*b).length()) : aStr.length() > bStr.length() ? aStr.length() : bStr.length();
		
		List<DeclaredLine> outputList = new ArrayList();
		
		outputList.add(new DeclaredLine(aStr,maxLineLenght, false));
		outputList.add(new DeclaredLine(bStr,maxLineLenght, false));
		
		//Creating lines every line is an Object (DeclaredLine) (String wrapper) in declarative style 
		//line knows how it should be printed (method DeclaredLine.showLine())
		for(int i=0;i<bStr.length(); i++) {
				if(i==0) {						//first line is special (underline)
					String currLine = String.valueOf((a*Integer.valueOf(bStr.charAt(bStr.length()-1-i)+"")));
					outputList.add(new DeclaredLine(currLine,maxLineLenght,true));
					continue;
				}
				String currLine = String.valueOf((a*Integer.valueOf(bStr.charAt(bStr.length()-1-i)+"")));
				outputList.add(new DeclaredLine(currLine,maxLineLenght-i,false));
				if(i==bStr.length()-1) {		//last line is special (underline)
					outputList.add(new DeclaredLine(String.valueOf(a*b),0,true));
				}
		}
		
		for(DeclaredLine declaredline : outputList) { //Printing result //make like lambda
			declaredline.showLine();
		}
	}
}
