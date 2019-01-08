package com;
public class QuickSort {
	
	public static void main(String args[])
	{
		QuickSort r = new QuickSort();
	  int[] arr = {7,2,1,6,8,5,3,4};
	  System.out.println("lets start");
      arr=r.quick(arr,0,arr.length-1);
      for(int i:arr)
    	  System.out.print(i+"..");
   
	}

	public int[] quick(int[] arr,int start,int end)
	{
		if(start>=end)
			return null;
		int partition = partition(arr,start,end);
		System.out.println(start+"...."+end);
		quick(arr,0,partition-1);
		quick(arr,partition+1,end);
		
		return arr;
	}
	
	public int partition(int[] arr,int start, int end)
	{
		int pivot = arr[end];
		int swapping = start;
		int temp=0;
		
		for(int i=start;i<end;i++)
		{
			if(arr[i] <= pivot)
				{temp = arr[swapping];
				arr[swapping] = arr[i];
				arr[i] = temp;
				
			swapping = swapping+1;	}
		}
		
		arr[end] = arr[swapping];
		arr[swapping] = pivot;
		
		return swapping;
		
	}
}
