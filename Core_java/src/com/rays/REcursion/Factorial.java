package com.rays.REcursion;

public class Factorial {
  
	public static int calcfactorial(int n) {
		
		if(n==1||n==0) {
			return 1;
		}
		
		int fac_num = calcfactorial(n-1);
		
		int fac = n*fac_num;
		
		return fac;
	}
	
	public static void main(String[] args) {
		
		int sum = calcfactorial(5);
		System.out.println(sum);
	}
}
