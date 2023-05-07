package com.programming.class3;

import java.util.ArrayList;
import java.util.Iterator;

// for type safety and type-casting
public class UseOfgerenics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList =new ArrayList();
		arrList.add("A");
		arrList.add(12); // type safety is not threre
		
		String str= (String) arrList.get(0); //type casting is required	
		System.out.println(str);
		
		Iterator itr= arrList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
	}

}
