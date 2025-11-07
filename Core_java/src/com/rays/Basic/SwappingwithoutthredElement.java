package com.rays.Basic;

public class SwappingwithoutthredElement {
  public static void main(String[] args) {
	
	  int a = 5;
	  int b = 10;
	  System.out.println("Before Swapping = a =>"+a+"  b=>"+b);
	  
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  
	  System.out.println("After Swapping = A =>"+a+"  b =>"+b);
}
}
