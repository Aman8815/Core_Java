package com.rays.REcursion;

public class StackLogn {
	
	public static int stacklogn(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		if(n%2==0) {
			return stacklogn(x,n/2)*stacklogn(x, n/2);
		}else {
			return stacklogn(x,n/2)*stacklogn(x, n/2)*x;
		}
		
	}
	
	public static void main(String[] args) {
		
		int sum = stacklogn(2, 4);
		System.out.println(sum);
	}

}
