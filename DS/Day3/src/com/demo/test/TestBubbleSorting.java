package com.demo.test;

import java.util.stream.IntStream;

import com.demo.sorting.BubbleSorting;

public class TestBubbleSorting {

	public static void main(String[] args) {

		int[] arr= {21,2,5,1,7,8,10,3};
		
		//BubbleSorting.bubbleSort(arr);
		BubbleSorting.bubbleSortImproved(arr);
		//BubbleSorting.bubbleSortImprovedDecending(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
	}

}
