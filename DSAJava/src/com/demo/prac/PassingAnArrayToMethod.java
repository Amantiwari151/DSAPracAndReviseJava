package com.demo.prac;

public class PassingAnArrayToMethod {
	
	static void findMin(int[] arr)
	{
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum element in an array is : " +  min);
	}
	public static void main(String[] args) {
		
		int []num = {45,78,57,23,66};
		findMin(num);
		
	}
	
}
