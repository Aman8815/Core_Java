package com.rays.String;

import java.util.Arrays;

public class anagaram {
	public static void main(String[] args) {
		
		String s1 = "aman";
		String s2 = "amit";
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Its anagram");
		}else {
			System.out.println("Its not anagram");
		}
	}

}
