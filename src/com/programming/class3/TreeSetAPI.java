package com.programming.class3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet= new TreeSet<>();
		treeSet.add("Z");
		treeSet.add("A");
		treeSet.add("A");
		treeSet.add("X");
		treeSet.add("D");
		
		Iterator<String> itr= treeSet.iterator();
		while(itr.hasNext()) {
		
			System.out.print(itr.next()+" ");
		}
	}

}
