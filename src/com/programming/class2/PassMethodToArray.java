package com.programming.class2;

public class PassMethodToArray {

	static void minArr(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimam value in array is "+min);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,777,8,99,2,890};
		minArr(arr);
	}

}
