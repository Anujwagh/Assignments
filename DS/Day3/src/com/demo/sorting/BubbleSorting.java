package com.demo.sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void bubbleSort(int[] arr) {

		int i,j;
		for( i=0;i<arr.length;i++) {
			for( j=1;j<arr.length-i;j++) {
				
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.println("Iteration:"+i);
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void bubbleSortImproved(int[] arr) {

		int i,j;
		for(i=0;i<arr.length;i++) {
			boolean flag=false;
			
			for(j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					flag=true;
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.println("Iteration:"+i);
			System.out.println(Arrays.toString(arr));
			if(!flag) 
				break;
			
			
			
			
		}
	}

	public static void bubbleSortImprovedDecending(int[] arr) {

		int i,j;
		for(i=0;i<arr.length;i++) {
			boolean flag=false;
			
			for(j=1;j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]) {
					flag=true;
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.println("Iteration:"+i);
			System.out.println(Arrays.toString(arr));
			if(!flag) 
				break;
			
			
			
			
		}
		
	}

}
