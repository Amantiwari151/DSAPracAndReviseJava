package com.demo.prac;

import java.util.Arrays;

public class ClonningAnArray {
	
	public static void main(String[] args) {
		
		int []arr = {33,3,4,5};
		System.out.println("Original array : ");

		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int []cArr = arr.clone();
		
		System.out.println("Clonned Array : " );
		
		for(int c : cArr) {
			System.out.print(c + " ");
		}
		System.out.println();

		
		System.out.println("Original Array After Clonning : " + Arrays.toString(arr));
	}
}
