package com.rays.String;

public class SortingString {
	public static void main(String[] args) {
		
		String name = "zedcaaz";
		
		char[] ch = name.toCharArray();
		
		for(char a = 'a';a<='z';a++) {
			for(int i=0;i<ch.length;i++) {
				if(a==ch[i]) {
					System.out.print(ch[i]);
				}
			}
		}
	}

}
