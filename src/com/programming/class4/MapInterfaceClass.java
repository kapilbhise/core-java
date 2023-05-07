package com.programming.class4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap-No order is maintained
		// Only one null key is allowed
		//any number of values can be there
		
		Map<Integer, String> hMap= new HashMap<>();
		hMap.put(10,"AB");
		hMap.put(9,"ZX");
		hMap.put(11,"CD");
		hMap.put(7,"JK");
		hMap.put(15, null);
		hMap.put(16, null);
		
		hMap.put(null,"PQ");
		hMap.put(null,"GH");// last one

		hMap.remove(15);

		System.out.println("Data- "+hMap.get(7));
		for (Map.Entry<Integer, String>  m: hMap.entrySet()) {
			System.out.println(m.getKey() +" : "+m.getValue());
		}
		
		System.out.println("Linked Hashmap------INSERTION ORDER------");
		
		
		Map<Integer, String> lhashMap= new LinkedHashMap<>();
		lhashMap.put(10,"AB");
		lhashMap.put(9,"ZX");
		lhashMap.put(11,"CD");
		lhashMap.put(7,"JK");
		lhashMap.put(15, null);
		lhashMap.put(16, null);
		
		lhashMap.put(null,"PQ");
		lhashMap.put(null,"GH");

//		lhashMap.remove(7);

		System.out.println("Data- "+lhashMap.get(7));
		for (Map.Entry<Integer, String>  m: lhashMap	.entrySet()) {
			System.out.println(m.getKey() +" : "+m.getValue());
		}
		
		
		
		
		
	}

}
