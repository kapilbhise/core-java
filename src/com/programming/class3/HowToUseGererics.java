package com.programming.class3;

import java.util.ArrayList;
import java.util.Iterator;

public class HowToUseGererics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//<> -generics
		ArrayList<String > arrList= new ArrayList();
		arrList.add("AB");
		
//		arrList.add(12); //type safety is there 
		
		
		String str= arrList.get(0); //type casting is not required
		System.out.println(str);
		
		Iterator itr= arrList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
		
	}

}
