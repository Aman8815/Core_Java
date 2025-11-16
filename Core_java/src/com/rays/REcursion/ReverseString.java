package com.rays.Recursion;



public class ReverseString {
	
	public static void revrse(String str,int n) {
		
		if(n==-1) {
			return;
		}
		System.out.println(str.charAt(n));
		revrse(str, n-1);
	
	}
	
public static void main(String[] args) {
	
	String str =  "abcd";
	int n = str.length();
	revrse(str, n-1);
}

}
