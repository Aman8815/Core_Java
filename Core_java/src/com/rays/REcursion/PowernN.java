package com.rays.REcursion;

public class PowernN {
	public static int power(int x,int n) {
		
		if(n==1) {
			return x*1;
		}
		if(x==0) {
			return 0;
		}
		 int powern = power(x, n-1);
		 int powernum = x*powern;
		 
		 return powernum;
	}
  
	public static void main(String[] args) {
		int sum =power(2,5);
		System.out.println(sum);
	}
}
