package com.rays.BitManupulation;

public class UpdateBit {
	public static void main(String[] args) {
		
		int n=5;
		int pos = 2;
		int bitmask = 1<<pos;
		int oper = 0;
		
		if(oper==0) {
			// clear bit
			
			int newbit = ~(bitmask);
			int newnum = (newbit&n);
			System.out.println(newnum);
			
		}else {
			// setBit
			
			int newnum = bitmask|n;
			System.out.println(newnum);
		}
	}

}
