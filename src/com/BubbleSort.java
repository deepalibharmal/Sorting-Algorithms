package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSort {
	
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
	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-i-1;j++)
		{
			if(ar.get(j)>ar.get(j+1))
			{	
				Collections.swap(ar, j, j+1);
			}
				
				 
		}
	System.out.println(ar);
	long endtime = System.nanoTime();
	System.out.println((endtime-starttime)/1000000000.0);
}
}
