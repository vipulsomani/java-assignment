package com.myJava;

public class findNumber {
	public static int missingNumber(int number[]) {
		int len=number.length;
		int totalSum=0;
		for(int i=0;i<len;i++)
		{	
			if(number[i]<0) {
				System.out.println("Negative value inserted at " + i + " index");
				return -1;
				}
			totalSum= totalSum+number[i];
			//System.out.println(totalSum);
		}
		float l=len+1;
		int sum = (int) ((l/2)*(number[0]+number[len-1]));
		int missingNumber=sum-totalSum;
		return missingNumber;
	}
}
