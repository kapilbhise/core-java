package com.programming.class3;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionFromArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] intArr= {1,2,3,4,5,6};
		
		ArrayList<Integer> arrList= new ArrayList<>(Arrays.asList(intArr));
		arrList.add(7);
		arrList.add(8);
		
		for(int i: arrList) {
			System.out.print(i+" ");
		}
		
	}

}
