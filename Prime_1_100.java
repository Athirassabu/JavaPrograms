package com.learning.java;

import java.util.Scanner;

public class Prime_1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter min and max limit to find prime numbers");
		int min=reader.nextInt();
		int max=reader.nextInt();
		
		for(int i=min;i<max;i++)
		{
			boolean prime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					 prime=false;
					break;
				}
			}
		
			if(prime)
			{
				System.out.print(i+"  ");
			}
		}
		
			
	}

}
