package com.programming.class4;

import java.util.Hashtable;
import java.util.Map;

// like vector, StringBuffer -legacy api-synchronized thread safe
// no null key and no null value
// no order
public class HashTableAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hTable= new Hashtable<>();
		hTable.put(1, "A");
		hTable.put(2, "B");
		hTable.put(7, "KB");
		hTable.put(3, "A");
//		hTable.put(4, null);//no null value is allowed
//		hTable.put(5, null);
//		hTable.put(null, "X"); // no null key is allowed
		for(Map.Entry<Integer, String> m:hTable.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
