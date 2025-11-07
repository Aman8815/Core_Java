package com.rays.Basic;

public class Fabbonacci {
	public static void main(String[] args) {
		  int x = 0;
		  int y = 1;
		  int z ;
		  
		  System.out.println(x);
		  System.out.println(y);
		  for(int i=1;i<=10;i++) {
			  z = y+x;
			  x =y;
			  y=z;
			  System.out.println(z);
		  }
	}

}
