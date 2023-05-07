package com.programming.class1;

// enhanced for loop
public class EnhancedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,34,5,67,86};
		
		// for loop
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// Enhanced for loop
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();

		
		String[] strArr= {"A","B", "C", "E"};
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}
		System.out.println();

		
		for (String i : strArr) {
			System.out.print(i+" ");
		}
		System.out.println();

		
	}

}
