package com;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
	
public static void main(String args[])
{
	long starttime = System.nanoTime();
	ArrayList<Integer> ar = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.print("Specify length of sorting elemets");
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		ar.add(sc.nextInt());
	}
	int temp;
	for(int i=0;i<n-2;i++)
		for(int j=i+1;j<n-1;j++)
		{
			if(ar.get(j)>ar.get(j+1))
			{
				temp=ar.get(j);
				ar.set(j,ar.get(j+1));
				ar.set(j+1,ar.get(j));
			}
				
				
		}
	System.out.println(ar);
	long endtime = System.nanoTime();
	System.out.println((endtime-starttime)/1000000000.0);
}
}
