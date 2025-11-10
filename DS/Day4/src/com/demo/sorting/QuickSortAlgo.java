package com.demo.sorting;

import java.util.Arrays;

public class QuickSortAlgo {
	
	
	private static int patition(int[] arr, int start, int end) {

		int pivot = start;
		int i = start;
		int j = end;
		
		while(i<j) {
			
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>start && arr[j]>arr[pivot]) {
				j--;
			}
		}
		
		if(pivot!=j) {
			int temp = arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=arr[temp];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("pivot position : "+j+" Pivot number : "+arr[j]);
		System.out.println(arr[j] + "  Swapped with "+arr[pivot]);
		
		return j;
		
	
	}

	public static void quickSort(int[] arr, int start, int end) {

		if(start<end) {
			int p=patition(arr,start,end);
			quickSort(arr,start,p-1);
			quickSort(arr,p+1,end);
		}
		
	}

	

}
