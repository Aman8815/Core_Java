package com.rays.String;

import java.util.Arrays;

public class IntCount {
	
	public static void main(String[] args) {
		
		 String[] arr = {"aman123"};
		 String name = "";
		 for(String s:arr) {
			 char[] ch = s.toCharArray();
			 
			for(int i=0;i<ch.length;i++) {
				if(Character.isDigit(ch[i])) {
					System.out.println(ch[i]);
				name = name+ch[i];
				}
				
			}
			
		 }
		 int arr1[] = new int[name.length()];
		 for(int i=0;i<name.length();i++) {
			 arr1[i] = Character.getNumericValue(name.charAt(i));
		 }
		 System.out.println(Arrays.toString(arr1));
	}

}
