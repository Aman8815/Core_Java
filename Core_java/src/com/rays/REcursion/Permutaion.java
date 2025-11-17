package com.rays.Recursion;

public class Permutaion {
	
	
	public static void sub(String str,String pom) {
		
		
		if(str.length()==0) {
			System.out.println(pom);
           return;
		}
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			String newstr = str.substring(0,i)+str.substring(i+1);
			
			sub(newstr, pom+ch);
		}
		
	}
	
	public static void main(String[] args) {
		
		String str = "abc";
		sub(str, "");
	}

}
