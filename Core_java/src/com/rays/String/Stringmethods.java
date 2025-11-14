
package com.rays.String;

import java.util.Arrays;

public class Stringmethods {
	public static void main(String[] args) {
		
		String str = "aman yashona";
		System.out.println(str.indexOf("y"));
		
		// remove the whitespacee
		System.out.println(str);
		System.out.println(str.trim());
		
		String[] str1 = str.split(" ");
		 for(String s:str1) {
			 System.out.print(s);
		 }
		 System.out.println();
		 System.out.println(str.substring(1));
		 
		 System.out.println(str.startsWith("a")); // gives the ture and false
		 System.out.println(str.endsWith("a"));  // gives the ture and false 
		 
		 System.out.println(str.replace("a","b")); // replace the string charactor
		 
		 System.out.println(str.toUpperCase());
		 System.out.println(str.toLowerCase());
		 
		 System.out.println(str.indexOf("m"));
	}

}
