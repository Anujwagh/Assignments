package com.demo.test;

import com.demo.search.SearchingService;

public class TestSearch {

	public static void main(String[] args) {

		int[] arr= {10,5,4,7,8,3,2,15};
		
		int pos = SearchingService.seqentialSearch(arr,15);
		if(pos!=-1) {
			System.out.println("number found at position : "+pos);
		}
		else {
			System.out.println("not found ");

		}
		
		int[] arr1 = {12,26,37,49,57,62,84};
		
		int pos1 = SearchingService.binarySearch(arr1,62);
		
		if(pos1!=-1) {
			System.out.println("number found at position : "+pos1);
		}
		else {
			System.out.println("not found ");

		}
		
		
		int pos2 = SearchingService.binarySearchRecurssive(arr1,57,0,6);
		
		if(pos2!=-1) {
			System.out.println("number found at position : "+pos2);
		}
		else {
			System.out.println("not found ");

		}

	}

}
