package com.myJava;

public class CommonElement {
	
	private int array1[];
	private int array2[];
	private int array3[];
	
	public CommonElement(int[] array1, int[] array2, int[] array3) {
		super();
		this.array1 = array1;
		this.array2 = array2;
		this.array3 = array3;
	}
public void commonElement(int[] array1,int[] array2, int[] array3) {
		
		int i,j,k;
		i=j=k=0;
		while(i < array1.length && j < array2.length && k < array3.length) {
			if(array1[i] == array2[j] && array2[j] == array3[k]) {
				System.out.println(array1[i]+" ");
				i++;j++;k++;
			}
			else if(array1[i] < array2[j]) {
				i++;
			}
			else if(array2[j] < array3[k]) {
				j++;
			}
			else k++;
		}
		
	}

}
