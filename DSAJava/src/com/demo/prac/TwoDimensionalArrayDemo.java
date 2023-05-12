package com.demo.prac;

public class TwoDimensionalArrayDemo {
	
	public static void main(String[] args) {
		int [][]arr = new int [3][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 8;
		arr[1][2] = 9;
		
		System.out.println(arr[1][1]);
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
