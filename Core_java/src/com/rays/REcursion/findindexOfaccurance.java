package com.rays.Recursion;

public class findindexOfaccurance {
	
	public static int first = -1;
	public static int last = -1;
	
	public static void find(String str, int n, char ele) {
	    
	    // Base condition: index string se bada
	    if(n == str.length()) {
	        System.out.println("First: " + first);
	        System.out.println("Last: " + last);
	        return;
	    }

	    char ch = str.charAt(n);

	    if(ch == ele) {
	        if(first == -1) {
	            first = n;
	        }
	        // last ALWAYS update
	        last = n;
	    }

	    find(str, n + 1, ele);
	}

	public static void main(String[] args) {
	    find("aataabaa", 0, 'a');
	}
}
