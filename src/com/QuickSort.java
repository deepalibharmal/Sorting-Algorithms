package com;
import java.util.*;

public class QuickSort {
static ArrayList<Integer> ar = new ArrayList<Integer>();
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Specify length of sorting elements:");
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		ar.add(sc.nextInt());
	}
sort(0,ar.size()-1);
System.out.println(ar);
}

public static int partition(int low,int high)
{   int pivot = high;
    high = high-1; 
    System.out.println("high:"+high+"low:"+low+"Pivot:"+pivot);    
	while(low<=high)
	{ 
	   if(ar.get(low)<ar.get(pivot) && low<pivot)
	   { 
		   System.out.println("I am n low");
		   low++;
	   }
	   if(ar.get(high)>ar.get(pivot) && high<pivot)
	   {  System.out.println("I am n high");
		   high--;
	   }
	   if(low>high) 
		   break;
	   else
		  Collections.swap(ar, low, high); 
	   


	}
	System.out.println("high:"+high+"low:"+low+"Pivot:"+pivot);   
	Collections.swap(ar, pivot, high);

	return high;
	
}

public static void sort(int low1,int high1)
{ 
 while(low1<=high1)
 {		System.out.println("i am in sort:"+ar);
	    int index = partition(low1,high1);	
	    if(low1==high1)
	    	
	    sort(low1,index-1);
	    sort(index+1,high1);
	   
 }
	

	}

	


}
