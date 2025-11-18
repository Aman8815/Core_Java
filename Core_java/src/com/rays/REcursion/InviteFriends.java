package com.rays.Recursion;

public class InviteFriends {
	
	public static int sub(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		int ways1 = sub(n-1);
		
		int ways2 = (n-1)*sub(n-2);
		System.out.println(ways1+ways2);
		return ways1+ways2;
	}
 public static void main(String[] args) {
	
	  int n=4;
	  System.out.println(sub(n));
}
}
