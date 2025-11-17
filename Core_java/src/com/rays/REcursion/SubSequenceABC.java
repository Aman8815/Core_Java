package com.rays.Recursion;

public class SubSequenceABC {
	
	public static void sub(String str,int idx,String str2) {
		
		if(idx==str.length()) {
			System.out.println(str2);
			return;
		}
		
		char ch = str.charAt(idx);
		
		sub(str, idx+1, str2+ch);
		
		sub(str, idx+1, str2);
		
	}
       public static void main(String[] args) {
		
    	   sub("abc", 0, "");
	}
}
