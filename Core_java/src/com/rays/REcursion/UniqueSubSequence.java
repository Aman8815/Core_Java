package com.rays.Recursion;

import java.util.HashSet;

public class UniqueSubSequence {
	
	public  static void sub(String str,int idx,String str1,HashSet<String> set) {
		
//		if (idx == str.length()) {
//			set.add(str1);
//			return;
//		}
		if(idx==str.length()) {
			if(set.contains(str1)) {
				return;
			}else {
				System.out.println(str1);
				set.add(str1);
				return;
			}
		}
		
		char ch = str.charAt(idx);
		sub(str, idx+1, str1+ch, set);
		
		sub(str, idx+1, str1, set);
		
	}
  public static void main(String[] args) {
	HashSet< String> set = new HashSet<String>();
	  sub("aaa",0,"", set);
	  
	  System.out.println(set);
}
}
