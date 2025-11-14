package com.rays.Arrays;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the row");
		int row = sc.nextInt();
		System.out.println("Enter the COloums");
		int colum = sc.nextInt();
		
		int arr[][] = new int[row][colum];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The Array element is");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Please Enter the your take a element");
		int num = sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<colum;j++) {
				
				if(num==arr[i][j]) {
					System.out.print(arr[i][j]+" the Place is => "+(i+1)+","+(j+1));
				}
			}
		}
		
	}

}
