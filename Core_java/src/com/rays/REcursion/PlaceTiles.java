package com.rays.Recursion;

public class PlaceTiles {
	
	public static int sub(int n,int m) {
		
		if(n==m) {
			return 2;
		}
		if(m>n) {
			return 1;
		}
		
		int ver = sub(n-m, m);
		
		int hor = sub(n-1, m);
		
		return ver+hor;
		
	}
  public static void main(String[] args) {
	
	  int n=4;
	  int m=2;
	  System.out.println(sub(n, m));
}
}
