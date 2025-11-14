package com.rays.BitManupulation;

public class GetBit {
    
	public static void main(String[] args) {
		
	
	 int n =5;
	 int pos = 2;
	 
	 int bitmask = 1<<pos;
	 
	 if((bitmask&n)==0) {
		 System.out.println("Its was Zero");
	 }
	 else {
		 System.out.println("its was one");
	 }
}
}