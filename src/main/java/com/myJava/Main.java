package com.myJava;

import java.security.PublicKey;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    	  System.out.println("Choose 1 for Missing Number Assignmnet");
	    	  System.out.print("Enter your choice :");
	    	   int choice= sc.nextInt();
	    	   switch(choice) {
	    	   case 1: 
	    		   System.out.println("Enter size of array");
	    		   int len=sc.nextInt();
	    		   int a[] = new int[len] ;
	    		   System.out.println("Enter values of array");
	    		   for(int i=0;i<len;i++) {
						a[i]=sc.nextInt();
					}
	    		   
	    		   System.out.println("Missing Number=" + findNumber.missingNumber(a));; 
	    		   break;
	    	
	}
}
}