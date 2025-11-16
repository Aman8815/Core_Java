package com.rays.Recursion;

public class TowerOfhonoi {
	public static void towerOfHanoi(int n, String src, String helper, String dest) {
	    if(n == 1) {
	        System.out.println("transfer disk " + n + " from " + src + " to " + dest+"=>1");
	        return;
	    }

	    towerOfHanoi(n - 1, src, dest, helper);   // Step 1
	    System.out.println("transfer disk " + n + " from " + src + " to " + dest+"=>2"); // Step 2
	    towerOfHanoi(n - 1, helper, src, dest);   // Step 3
	}

	public static void main(String args[]) {
	    int n = 3;
	    towerOfHanoi(n, "S", "H", "D");
	}


}
