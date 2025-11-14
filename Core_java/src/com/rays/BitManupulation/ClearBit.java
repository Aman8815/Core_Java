package com.rays.BitManupulation;

public class ClearBit {
  public static void main(String[] args) {
	
	  int n =10;
	  int pos = 2;
	  int bitmask = 1<<pos;
	  
	  int newbitmask = ~(bitmask); // not operator
	  
	   int newnum = newbitmask&n;
	   System.out.println(newnum);
	  
}
}
