package com.rays.Recursion;

public class moveTOALLX {
	
	public static void move(int count,int idx,String str,String newString) {
		
		if(idx==str.length()) {
			for(int i=0;i<count;i++) {
				newString+='x';
			}
			System.out.println(newString);
			return;
		}
		
		char tochar = str.charAt(idx);
		if(tochar=='x') {
			count++;
			move(count, idx+1, str, newString);
		}else {
			newString += tochar;
			move(count, idx+1, str, newString);
		}
		
	}
	
	public static void main(String[] args) {
		
		move(0, 0,"xxabcxxd","");
	}

}
