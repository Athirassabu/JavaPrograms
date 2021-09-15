package com.learning.java;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=20,b=30,temp=0;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a+"\n"+b);
//Without using 3rd variable
		/*
		 * a=a+b; b=a-b; a=a-b; System.out.println(a+"\n"+b);
		 */

	}

}
