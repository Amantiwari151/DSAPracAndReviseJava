package com.demo.prac;

public class ShallowCopyOfAnArray {
	
	static void printArr(int [] arr) {
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int []arr = {33,3,4,5};
		
		System.out.println("Original Array : ");
		printArr(arr);
		
		int []copyArr = arr;
		
		System.out.println("Copied Array : ");
		printArr(copyArr);
		
		copyArr[1] = 77;
		
		System.out.println("Copied Array after changing value : ");
		printArr(copyArr);
		
		System.out.println("Original Array after changing value of Copied Array: ");
		printArr(arr);
		
		
	}
}
