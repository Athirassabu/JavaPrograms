package com.learning.java;

import java.util.Scanner;

class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number to count digits");
		int num=reader.nextInt();
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
System.out.println("Digit in number is:"+count);
	}

}
