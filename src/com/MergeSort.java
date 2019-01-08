package com;

public class MergeSort {
	int [] fin =new int[10];
	public static void main(String args[])
	{
		int[] arr = {7,2,0,1,4,6};
		MergeSort m = new MergeSort();
		m.partition(arr, 0, arr.length-1);
	      for(int i:arr)
	    	  System.out.print(i+"..");
		
	}

	public void partition(int[] arr,int start,int end)
	{   
	
		if(start>=end)
		{
			return;
		}
		int mid = start+(end-start) / 2;
		
		int[] left = new int[mid-start+1];
		int[] right = new int[end-mid];
		
		
	    partition(arr,start,mid);
	    partition(arr,mid+1,end);

		int counter=0;
		for(int i=start;i<=mid;i++)
			{ left[counter]=arr[i];
			  counter++; }
		
		counter=0;
		for(int i=mid+1;i<=end;i++)
			{ right[counter]=arr[i];
			  counter++;	
			}
	    Merge(arr,left,right,start);
	}
	
	public int[] Merge(int[] arr,int[] left,int[] right,int start)
	{                          
		 int i=0,j=0,k=start;
		 
		while(i<left.length && j<right.length)
		{  	
			if(left[i]<right[j])
				{
				arr[k]=left[i];
				i++;
				}
			else {
				 arr[k]=right[j];
				 j++;
			     }
			k++;
		}
		
	
		while(i<left.length)
		{	
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{   
			arr[k]=right[j];
			j++;
			k++;
		}

		return arr;
	}
	
	
}
