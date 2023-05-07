package com.programming.class1;

// loops in java
public class LoopConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		// while loop
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		
		// for loop
		for(int j=1;j<=10;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		
		//do while loop- execute the code at least once
		int k=1;
		do {
			System.out.print(k+" ");
			k++;
		}while(k<=10);
		System.out.println();
		
//		// infinite while
//		while(true) {
//			System.out.println("All time true");
//		}
		
//		// infinite for
//		for(;;) {
//			System.out.println("All time true");
//		}
		
		
	
	}

}
