package strategy.sort_impl;

import strategy.sort_interface.Sort;

public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] arr) {
		int len=arr.length;
	       int temp;
	       for(int i=0;i<len;i++)
	       {
	           temp=arr[i];
	           int j;
	           int samllestLocation=i;
	           for(j=i+1;j<len;j++)
	           {
	              if(arr[j]<temp)
	              {
	                  temp=arr[j];
	                  samllestLocation=j;
	              }
	           }
	           arr[samllestLocation]=arr[i];
	           arr[i]=temp;
	       }
	       return arr;
	}

}
