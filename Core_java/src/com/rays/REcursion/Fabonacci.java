package com.rays.REcursion;

public class Fabonacci {
	
	public static void facbonacci(int a,int b,int n) {
		 
		if(n==0) {
			return;
		}
		int c = a+b;
		System.out.println(c);
		facbonacci(b, c, n-1);
	    
	}
	public static void main(String[] args) {
		int a =0;
		int b=1;
		int n=7;
		System.out.println(a);
		System.out.println(b);
		facbonacci(0, 1,n-2);
		
	}

}
