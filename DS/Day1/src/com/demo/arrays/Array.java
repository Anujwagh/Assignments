package com.demo.arrays;

import java.util.Arrays;

public class Array {

	private int[] arr;
	private int count;

	public Array() {
		arr = new int[10];
		count = 0;
	}

	public Array(int[] arr, int count) {

		this.arr = arr;
		this.count = count;
	}

	public Array(int size) {
		arr = new int[size];
		count = 0;
	}

	public int getCapacity() {
		return arr.length;
	}

	public int getSize() {
		return count;
	}

	// Add at the end of array
	public boolean add(int x) {
		if (count < arr.length) {
			arr[count] = x;
			count++;

			return true;

		}
		return false;
	}

	// Add at the given position
	public boolean add(int value, int pos) {
		if (count < arr.length && pos < count) {

			for (int i = count; i > pos; i--) {
				arr[i] = arr[i - 1];
			}

			arr[pos] = value;
			count++;
			return true;
		}
		return false;
	}

	

	public int searchByValue(int value) {
		for (int i = 0; i < count; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public boolean deleteByPos(int pos) {
		if (pos < count) {
			for (int i = pos; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[count - 1] = 0;
			count--;
			return true;
		}
		return false;
	}

	
	public boolean deleteByValue(int value) {
		int idx = searchByValue(value);
		if (idx != -1) {
			return deleteByPos(idx);
		}
		return false;
	}

	
	public void rotateArray(boolean flag,int num) {
		if(flag) {
			//right rotation
			for(int cnt=0;cnt<num;cnt++) {
				int temp=arr[count-1];
				for(int i=count-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
		}else{
			//left rotation
			for(int cnt=0;cnt<num;cnt++) {
				int first=arr[0];
				for(int i=0;i<count-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[count-1]=first;
			}
		}
		
	}
	
	
	public int findmax() {
		int max=arr[0];
		for(int i=1;i<count;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public int findmin() {
		int min=arr[0];
		for(int i=1;i<count;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	
	
	public int findSum() {
		int sum=0;
		for(int i=0;i<count;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

	
	public int[] reverseArray(boolean flag) {
		if(flag) {
			for(int i=0,j=count-1;i<j;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			return arr;
		}else {
			int[] arr1=new int[count];
			for(int i=count-1,j=0;i>=0;i--,j++) {
				arr1[j]=arr[i];
			}
			return arr1;
		}
		
	}
	
	@Override
	public String toString() {
		return "Array [arr=" + Arrays.toString(arr) + "]";
	}

}
