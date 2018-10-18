package com;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String args[])
	{
		long starttime = System.nanoTime();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Specify length of sorting elemets:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			ar.add(sc.nextInt());
		}
		int temp;
		for(int i=1;i<n;i++)
		{  int counter=i-1;
		   int key=ar.get(i);
		   while(key<ar.get(counter) && counter>=0)
			{
			   temp = ar.get(counter);
			   ar.set(counter,key);
			   ar.set(counter+1,temp);
			   counter--;
			   if(counter<0)
				   break;

			}
			
		}
		System.out.println(ar);
		long endtime = System.nanoTime();
		System.out.println((endtime-starttime)/1000000000.0);
	}
	

}
