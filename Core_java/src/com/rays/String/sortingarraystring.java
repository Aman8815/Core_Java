package com.rays.String;

public class sortingarraystring {
	public static void main(String[] args) {
		
		String[] str= {"aman","yashona"};
		
		for(String s:str) {
			
			char[] ch = s.toCharArray();
			
			for(char a='a';a<='z';a++) {
				for(int i=0;i<ch.length;i++) {
					if(a==ch[i]) {
						System.out.println(a+"=>"+ch[i]);
					}

					
				}
			}
			
 		}
	}   

}
