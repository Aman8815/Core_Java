package com.rays.Recursion;

public class RemoveDuplicate {
   
	public static boolean map[] = new boolean[26];
	
	public static void remove(String str,int idx,String str1) {
		
		if(idx==str.length()) {
			System.out.println(str1);
			return;
		}
		char ch = str.charAt(idx);
		
		if(map[ch-'a']) {
			remove(str, idx+1,str1);
		}else {
			str1+=ch;
			map[ch-'a'] = true;
			remove(str, idx+1,str1);
		}
		
	}
	
	public static void main(String[] args) {
		
		remove("aabbccdd",0,"");
	}
}
