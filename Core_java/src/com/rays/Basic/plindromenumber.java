package com.rays.Basic;

public class plindromenumber {
	
	public static void main(String[] args) {
		
		int num = 121;
		int r=0,sum=0,a=num;
		
		while(num>0) {
			r = num%10;
			sum = r+(sum*10);
			num = num/10;
		}
		
		if(a==sum) {
			System.out.println("Its Plindrome Number");
		}else {
			System.out.println("Its Not Plindrome Number");
		}
	}

}
