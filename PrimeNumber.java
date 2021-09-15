package com.learning.java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime=true;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		int num=reader.nextInt();

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=false;
				//break;
			}
		}
		if(prime==true)
		{
			System.out.println("Prime");
		}
		else 
			
			System.out.println("Not prime");
	}

}
