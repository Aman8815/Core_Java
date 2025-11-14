package com.rays.String;

public class Stringbuffermethods {
	
	public static void main(String[] args) {
		 
		StringBuffer sb =  new StringBuffer("Amana");
		
		sb.append("yashona");
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		
		sb.append("sigh talod");
		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(2));
		
		System.out.println(sb.replace(0,5,"amit"));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.delete(0,5));
		
		
	}

}
