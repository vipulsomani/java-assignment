package com.myJava;
public class AllZeorsATEnd {
	public int[] AllZerosAtEnd(int array[],int number) {
		int count = 0;
		
		for(int i=0;i<number;i++) {
			if(array[i] != 0 ) {
				array[count++] =array[i];
			}
		}
			while(count <number) {
				array[count++] = 0;
			}
		return array;
	}
}
