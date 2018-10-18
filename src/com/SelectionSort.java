package com;
import java.util.*;

public class SelectionSort {
	
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
    {
    	for(int j=i+1;j<n;j++)
    	{
    		if (ar.get(i) > ar.get(j))
    		{   temp = ar.get(i);
    			ar.set(i, ar.get(j));
    			ar.set(j,temp);
    			
    		}
    			
    	}
    	
    }
    System.out.println(ar);
	long endtime = System.nanoTime();
	System.out.println((endtime-starttime)/1000000000.0);
	}
	


	
	
}
