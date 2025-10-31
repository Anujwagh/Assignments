package com.demo.array;

import java.util.Scanner;

import com.demo.array.*;

public class Array2D {
	private int[][] arr;

	public Array2D() {
		arr = new int[3][3];
	}

	public Array2D(int rows,int cols) {
		arr = new int[rows][cols];
	}

	public void acceptData() {

		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Array"+i+","+j);
				arr[i][j]=sc.nextInt();
			}
		}
	}

	public void displayData() {

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	
	public int[] findSumRowwise() {
		int[] sumrow=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sumrow[i]+=arr[i][j];
				
			}
			
		}
		return sumrow;
	}
	
	public int[] findSumColwise() {
		int[] sumcols=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				sumcols[i]+=arr[j][i];
			}
		}
		return sumcols;
	}
	
	public int[][] add2DArrays(Array2D ob){
		if(this.arr.length==ob.arr.length && this.arr[0].length==ob.arr[0].length) {
			
			int[][] temp= new int[arr.length][arr[0].length];
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					temp[i][j]=this.arr[i][j]+ob.arr[i][j];
				}
			
			}
			return temp;
		}
		return null;
	}
	
	
	public int[][] sub2DArrays(Array2D ob){
		if(this.arr.length==ob.arr.length && this.arr[0].length==ob.arr[0].length) {
			
			int[][] temp= new int[arr.length][arr[0].length];
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					temp[i][j]=this.arr[i][j]-ob.arr[i][j];
				}
			
			}
			return temp;
		}
		return null;
	}
	public int [][] transpose(){
		int temp[][]=new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[0].length;j++) {
				temp[j][i]=arr[i][j];
					
				
			}
		}
		return temp;
	}
	public boolean issymmetric() {
		if(arr.length==arr[0].length) {
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[0].length;j++) {
					if(arr[i][j]!=arr[j][i]) {
						return false;
					}
				}return true;
			}
		}
		return false;
	}
	
	public boolean isIdentity(){
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if((i==j)&& arr[i][j]!=1){
					return false;
					
				}else if((i!=j)&&arr[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
	}
	
		
	

}
