package com.rays.Basic;

public class ArmStrong {
	
	public static void main(String[] args) {
		
		int num = 153;
		int r =0,sum=0,a=num;
	
		while(num>0) {
			r = num%10;
			sum = sum+(r*r*r);
			num = num/10;
		}
		
		if(a==sum) {
			System.out.println("Its Armstrong Number");
		}else {
			System.out.println("Its not ArmStrong Number");
		}
		
	}

}
