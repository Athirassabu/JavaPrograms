package com.learning.java;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {22,34,55,67,88,99,100,101,234};
		int len=array.length;
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
			System.out.println(array[i]);
		}
		
		

	}

}
