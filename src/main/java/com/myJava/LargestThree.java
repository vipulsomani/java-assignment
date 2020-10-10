package com.myJava;

import java.util.Arrays;

public class LargestThree {
	
	static int[] findLargestThreeElements(int array[]) {
		int[] largest = new int[3];
		Arrays.sort(array);
		for(int i=0;i<3;i++)
			largest[i] = array[array.length-i-1];
		return largest;
	}
}
