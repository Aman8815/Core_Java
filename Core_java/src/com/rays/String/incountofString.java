package com.rays.String;

public class incountofString {
   public static void main(String[] args) {
	 
	    String name = "aman12346";
	    int count = 0;
	    
	    for(int i=0;i<name.length();i++) {
	    	if(Character.isDigit(name.charAt(i))) {
	    		count ++;
	    		System.out.println(name.charAt(i));
	    	}
	    }
	    System.out.println("number of in string"+count);
	    
}

}
