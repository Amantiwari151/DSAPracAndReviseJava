package com.demo.prac;

public class ArraysDemo1 {
	public static void main(String[] args) {
//		Declarartion
		int []arr = {33,46,55,90,69};
//		initialization
//		arr[0]=2;
//		arr[1]= 4;
//		arr[2]=6;
//		arr[3]= 8;
//		arr[4]= 10;
		
//		Traverse an array 
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		traversing arrray using for each loop
		
		for(int data: arr) {
			System.out.println(data);
		}
		
	}
}
