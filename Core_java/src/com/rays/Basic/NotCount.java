package com.rays.Basic;

public class NotCount {
	public static void main(String[] args) {
		

	
	int arr[] = {500,200,100,50,20,10,5,2,1};
	int amount = 13256;
	int count =0;
	
	for(int i=0;i<arr.length;i++) {
		count = amount/arr[i];
		if(count>0) {
		System.out.println(count+"=>"+arr[i]);
		}
		amount=amount%arr[i];
	}

}
}