package com.rays.Arrays;

import java.util.Scanner;

public class practice {
   
	public static void main(String[] args) {
		int size = 10;
	 int arr[] = new int[size];
	 Scanner sc = new Scanner(System.in);
	  for(int i=0;i<size;i++) {
		  arr[i]=sc.nextInt();
	  }
	  
	  int num = 10;
	  
	  for(int j =0;j<size;j++) {
		 if(num==arr[j]) {
			 System.out.println(arr[j]+"  "+(j+1));
		 }
		 
	  }
	}
}
