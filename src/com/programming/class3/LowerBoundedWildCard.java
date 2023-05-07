package com.programming.class3;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {

	// ? -wildcard -super- lower limit
	static void printListItems(List<? super Integer> objs) {
		for(Object obj : objs) {
			System.out.print(obj+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listInt =new ArrayList<>();
		listInt.add(12);
		listInt.add(13);
		listInt.add(143);
		
		List<Number> listNum =new ArrayList<>();
		listNum.add(10);
		listNum.add(130000L);
		listNum.add(123.324f);
		
		List<Double> listDou =new ArrayList<>();
		listDou.add(165.654650);
		listDou.add(1.3654D);
		
		
		printListItems(listInt);
		printListItems(listNum);
//		printListItems(listDou);
		
	}

}
