package com.rays.String;

public class Vowels {
	
	public static void main(String[] args) {
		
		String name = "aeiou";
		char[] ch = name.toCharArray();
		int count =0;
		
		for(int i=0;i<ch.length;i++) {
			
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				 
				System.out.println(ch[i]);
				count++;
			}
			
			
		}
		System.out.println("Vowels is =>"+count);
	}

}
