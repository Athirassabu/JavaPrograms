package com.learning.java;
import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the year to check leap year");
		int num=reader.nextInt();
		if((num%400==0)&&(num%100!=0)||(num%4==0))
		{
			System.out.println("Leap year");
		}
		else
		System.out.println("Not leap year");
	}
}
