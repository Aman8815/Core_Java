package com.rays.Recursion;

public class SortedToString {
	
	public static void Fun(String str,int idx,String str1) {
		if(idx==str.length()) {
			System.out.println(str1);
			return;
		}
		char ch = str.charAt(idx);
		for(char a='a';a<='z';a++) {
			if(ch==a) {
				str1+=ch;
			}
		}
		Fun(str, idx+1, str1);
	}
	
	public static void main(String[] args) {
		
		Fun("cba",0,"");
	}
	

}
