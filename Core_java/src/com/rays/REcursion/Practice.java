package com.rays.REcursion;

public class Practice {
	
	public static void print(int n,int i,int sum) {
		
		if(n==i) {
			sum +=i;
			System.out.println(sum);
			return ;
		}
		sum+=i;
		 print(n,i+1,sum);
		
	}
	
	public static void main(String[] args) {
		
		 print(10,1,0);
		
	}

}
