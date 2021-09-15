package com.learning.java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the string to reverse");
		String s = reader.nextLine();
		String rev = "";
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("The reverse string is:"+"\n" + rev);
	
	
	//Using stringBuilder
	StringBuffer sb=new StringBuffer(s);
	System.out.println("Reverse using string builder is:"+"\n"+sb.reverse());
	
	}
}
