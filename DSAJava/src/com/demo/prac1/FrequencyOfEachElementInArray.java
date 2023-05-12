package com.demo.prac1;

public class FrequencyOfEachElementInArray {
	
	public static void main(String[] args) {
		
		int []arr = {1,2,8,3,3,3,3,2,1};
		
		int []fr = new int[arr.length];
		
		int visited = -1;
		
		for(int i=0;i<arr.length;i++) {
			int counter = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					counter ++;
//					for avoiding counting the same element again
					fr[j] = visited;
				}
				if(fr[i] != visited) {
					fr[i] = counter;
				}
				
			}
		}
		
//		Traverse frequency array 
		
		System.out.println("Element | frequency");
		for(int i=0;i<fr.length;i++) {
			if(fr[i] !=visited) {
				System.out.println(" " + arr[i] + "  |   " + fr[i]);
			}
		}
		
	}
}
