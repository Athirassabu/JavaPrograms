package com.learning.java;

import java.util.Scanner;

public class FactorailNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int num=reader.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
		fact=fact*i;	
		}
		System.out.println("Factorial of number is:"+fact);
	}

}
