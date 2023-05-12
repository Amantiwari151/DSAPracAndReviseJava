package com.demo.prac;

public class CopyingAnArray {
	
	public static void main(String[] args) {
//		copying an array to another by the arraycopy method of System class
		
		char []copyForm = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };
		
//		new array 
		char []copyTo = new char[7];
		
		System.arraycopy(copyForm,2 ,copyTo,0,7);
		
		System.out.println(copyTo);
		
	}
}
