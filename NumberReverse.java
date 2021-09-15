package com.learning.java;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int num=reader.nextInt();
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
System.out.println("The reverse of a number is:"+rev);
	}

}
