package com.rays.String;

public class ReverseAtSamePlace {
	
	public static void main(String[] args) {
		
		String name = "aman yashona";
		
		String[] n = name.split(" ");
		
	for(int i=0;i<n.length;i++) {
		
		for(int j=n[i].length()-1;j>=0;j--) {
			System.out.print(n[i].charAt(j));
		}
		System.out.print(" ");
		
	}
		
		
	}

}
