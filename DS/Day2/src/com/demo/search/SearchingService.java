package com.demo.search;

public class SearchingService {

	public static int seqentialSearch(int[] arr, int n) {

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		
		return -1;
	}

	public static int binarySearch(int[] arr1, int n) {

		int low=0;
		int high=arr1.length-1;
		int cnt=0;
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			cnt++;
			
			if(arr1[mid]==n) {
				System.out.println("comparisons are : "+cnt);
				return mid;
			}
			
			if(n<arr1[mid]) {
				high=mid-1;
				
			}else
			{
				low=mid+1;
			}
			
			
		}
		System.out.println("comparisons are : "+cnt);
		return -1;
	}

	public static int binarySearchRecurssive(int[] arr1, int n, int low, int high) {

		System.out.println("binary search called "+low+"-----"+high);

		if(low<=high) {
			int mid=(low+high)/2;
			if(n==arr1[mid])
			{
				return mid;
			}
			if(n<arr1[mid]) {
				return binarySearchRecurssive(arr1,n,low,mid-1);
			}
			else {
				return binarySearchRecurssive(arr1,n,mid+1,high);
			}
		}
		return -1;
	}

	

	
}
