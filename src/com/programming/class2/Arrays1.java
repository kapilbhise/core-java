package com.programming.class2;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
		int[] intArr =new int[4];
		
		//initialization
		intArr[0]=33;
		intArr[2]=433;
		intArr[3]=663;
		intArr[1]=9;
		
		//looping through array
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
			
		}
		System.out.println();
		
		//declaration with initialization
		int[] intArr2= {1,43,4,4,5,7,8,9};
		//reading the array
		for(int i=0;i<intArr2.length;i++) {
			System.out.print(intArr2[i]+" ");
			
		}
		System.out.println();
		
		String[] strArr= {"A","B","C"};
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
			
		}
		
	}

}
