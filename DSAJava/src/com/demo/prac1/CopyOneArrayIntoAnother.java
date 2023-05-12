package com.demo.prac1;

import java.util.Arrays;

public class CopyOneArrayIntoAnother {
	
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5};
		
		int []copyArr = new int[5];
		
		for(int i=0;i<copyArr.length;i++) {
			copyArr[i] = arr[i];
		}
		
//		Traverse array
		
		System.out.println("Original Array : " + Arrays.toString(arr));
		System.out.println("Copied Array : " + Arrays.toString(copyArr));
	}
}
