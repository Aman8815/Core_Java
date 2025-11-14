package com.rays.String;

public class Stringplindrome {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("madam");
		
		StringBuffer str  = sb.reverse();
		
		 if(sb.equals(str)) {
			 System.out.println("its plindrome ");
		 }
		 else {
			 System.out.println("its not palindrome");
		 }
		 
	}

}
