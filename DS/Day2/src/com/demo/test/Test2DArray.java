package com.demo.test;

import java.util.Arrays;

import com.demo.array.Array2D;

public class Test2DArray {

	public static void main(String[] args) {

		Array2D ob = new Array2D();
//		Array2D ob1=new Array2D(3,3);

		ob.acceptData();
//		ob1.acceptData();
		ob.displayData();
//		ob1.displayData();
		int temp[] = ob.findSumRowwise();
		System.out.println("sum of row:"+Arrays.toString(temp));
	
		int temp1[] = ob.findSumColwise();
		System.out.println("sum of col:"+Arrays.toString(temp1));

//		int[][] arr=ob.add2DArrays(ob1);
//		if(arr!=null) {
//			displayData(arr);
//		}else {
//			System.out.println("dimenssions doesnot match");
//		}
//		
//		System.out.println("-------------------------------");
//		
//		int[][] arr1=ob.sub2DArrays(ob1);
//		if(arr1!=null) {
//			displayData(arr1);
//		}else {
//			System.out.println("dimenssions doesnot match");
//		}
		
		System.out.println("-------------------------------");
		int [][]arr2=ob.transpose();
		if(arr2!=null) {
			displayData(arr2);
			
		}else {
			System.out.println("dimenssions doesnot match");
		}
		
		System.out.println("-------------------------------");
		if(ob.issymmetric()) {
			System.out.println("is sysmetric");
		}else {
			System.out.println("not sysmetric");
		}
		System.out.println("-------------------------------");
		if(ob.isIdentity()) {
			System.out.println("is identity");
		}else {
			System.out.println("not identity");
		}
	}

	private static void displayData(int[][] arr) {

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	

}
