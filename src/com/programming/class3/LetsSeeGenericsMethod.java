package com.programming.class3;

public class LetsSeeGenericsMethod {
	
	// declaration of type is must -E is recommended
	static <E> void printArray(E[] elements) {
		for (E ele : elements) {
			System.out.print(ele+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character [] charArr= {'A','b','c','D','e'};
		Integer [] intArr ={1,2,3,4,5,6,7,8};
		Boolean[] bArr= {true, false};
		
		System.out.println("Character array -");
		printArray(charArr);
		
		System.out.println("Integer array -");
		printArray(intArr);
				
		
		System.out.println("Boolean array -");
		printArray(bArr);
		
	}

}
