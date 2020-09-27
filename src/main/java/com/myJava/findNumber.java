package com.myJava;

public class findNumber {
	public static int missingNumber(int number[]) {
		int len=number.length;
		int totalSum=0;
		for(int i=0;i<len;i++)
		{
			totalSum= totalSum+number[i];
		}
		len=len+1;
		int sum=len*(len+1)/2;
		int missingNumber=sum-totalSum;
		return missingNumber;
	}
}
