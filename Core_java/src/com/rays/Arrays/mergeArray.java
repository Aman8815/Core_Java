package com.rays.Arrays;

public class mergeArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};
		 int num = arr.length+arr2.length;
		 System.out.println(num);
		int arr3[] = new int[num];
		
		for(int i=0;i<num-5;i++) {
			int j=5;
			int temp;
			int temp2;
			temp= arr[i];
			temp2= arr2[i];
			
			arr3[i] = temp;
			arr3[i+j]= temp2;
			
			temp=0;
			temp2=0;
			i--;
		}
		
		for(int j=0;j<num;j++)
		{
		System.out.print(arr3[j]+"aman");	
		}
	
	}

}
