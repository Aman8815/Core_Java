package com.rays.Recursion;

public class KeypadCompination {
	
	public static String[] arr = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	
	public static void sub(String str,int idx,String com) {
		  if(idx==str.length()) {
			  System.out.println(com);
			  return;
		  }
		
		char ch = str.charAt(idx);
		String str1  = arr[ch-'0'];
		for(int i=0;i<str1.length();i++) {
			sub(str, idx+1, com+str1.charAt(i));
		}
	}
	
public static void main(String[] args) {
	
	sub("23", 0, "");
}
}
