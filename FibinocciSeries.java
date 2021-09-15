package com.learning.java;

public class FibinocciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,sum;
		System.out.println(n1+"\n"+n2);
		int limit=10;
		for(int i=2;i<limit;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;	
		}
	}

}
